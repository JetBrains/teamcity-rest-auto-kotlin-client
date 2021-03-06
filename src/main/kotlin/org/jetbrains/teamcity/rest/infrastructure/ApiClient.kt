package org.jetbrains.teamcity.rest.infrastructure

import okhttp3.*
import org.slf4j.LoggerFactory
import java.io.File
import java.io.IOException
import java.util.regex.Pattern

open class ApiClient(val clientConfig: ClientConfig) {
    companion object {
        @PublishedApi internal val ContentType = "Content-Type"
        @PublishedApi internal val Accept = "Accept"
        @PublishedApi internal val Authorization = "Authorization"
        @PublishedApi internal val JsonMediaType = "application/json"
        @PublishedApi internal val FormDataMediaType = "multipart/form-data"
        @PublishedApi internal val XmlMediaType = "application/xml"

        @JvmStatic
        val client by lazy {
            builder.build()
        }

        @JvmStatic
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()

        @JvmStatic
        var defaultHeaders: Map<String, String> by ApplicationDelegates.setOnce(mapOf(ContentType to JsonMediaType, Accept to JsonMediaType))

        @JvmStatic
        val jsonHeaders: Map<String, String> = mapOf(ContentType to JsonMediaType, Accept to JsonMediaType)

        inline fun <reified T : Any> processResponse(response: ApiInfrastructureResponse<T>): T {
            return when (response.responseType) {
                ResponseType.Success -> (response as Success<*>).data as T
                ResponseType.Informational -> TODO()
                ResponseType.Redirection -> TODO()
                ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
                ResponseType.ServerError -> throw ServerException((response as ServerError<*>).body as? String ?: "Server error")
            }
        }
    }

    val LOG = LoggerFactory.getLogger(this.javaClass.name)

    @PublishedApi internal inline fun <reified T> requestBody(content: T, mediaType: String = JsonMediaType): RequestBody {
        when {
            content is File -> {
                return RequestBody.create(
                        MediaType.parse(mediaType), content
                )
            }
            content is String -> {
                return RequestBody.create(
                        MediaType.parse(mediaType), content
                )
            }
            mediaType == FormDataMediaType -> {
                val requestBodyBuilder = MultipartBody.Builder().setType(MultipartBody.FORM)

                // content's type *must* be Map<String, Any>
                @Suppress("UNCHECKED_CAST")
                (content as Map<String, Any>).forEach { key, value ->
                    if (value::class == File::class) {
                        val file = value as File
                        requestBodyBuilder.addFormDataPart(key, file.name, RequestBody.create(MediaType.parse("application/octet-stream"), file))
                    } else {
                        val stringValue = value as String
                        requestBodyBuilder.addFormDataPart(key, stringValue)
                    }
                    TODO("Handle other types inside FormDataMediaType")
                }

                return requestBodyBuilder.build()
            }
            mediaType == JsonMediaType -> {
                return RequestBody.create(
                        MediaType.parse(mediaType), Serializer.moshi.adapter(T::class.java).toJson(content)
                )
            }
            mediaType == XmlMediaType -> {
                TODO("xml not currently supported.")
            }
        }

        // TODO: this should be extended with other serializers
        TODO("requestBody currently only supports JSON body and File body.")
    }

    @PublishedApi internal inline fun <reified T : Any> responseBody(response: Response, mediaType: String = JsonMediaType): T {
        if (T::class.java == java.io.File::class.java) {
            return downloadFileFromResponse(response) as T
        } else if (T::class == Unit::class) {
            return Unit as T
        }

        var contentType = response.headers().get("Content-Type")

        if (contentType == null) {
            contentType = JsonMediaType
        }

        return when {
            isJsonMime(contentType) -> {
                Serializer.moshi.adapter(T::class.java).fromJson(response.body()?.source())!!
            }
            contentType.equals(String.javaClass) -> {
                response.body().toString() as T
            }
            else -> {
                TODO("Fill in more types!")
            }
        }
    }

    fun isJsonMime(mime: String?): Boolean {
        val jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"
        return mime != null && (mime.matches(jsonMime.toRegex()) || mime == "*/*")
    }

    inline fun <reified T : Any> request(requestConfig: RequestConfig, body: Any? = null): ApiInfrastructureResponse<T> {
        val httpUrl = HttpUrl.parse(clientConfig.baseUrl) ?: throw IllegalStateException("baseUrl is invalid.")

        var urlBuilder = httpUrl.newBuilder()
                .addPathSegments(
                        requestConfig.path.trimStart('/')
                )

        requestConfig.query.forEach { query ->
            query.value.forEach { queryValue ->
                urlBuilder = urlBuilder.addQueryParameter(query.key, queryValue)
            }
        }

        if (requestConfig.encodedQuery != null) {
            urlBuilder.addEncodedPathSegment(requestConfig.encodedQuery)
        }

        val url = urlBuilder.build()
        val headers = (defaultHeaders + requestConfig.headers).toMutableMap()
        LOG.info("[{}] {} | headers: {}", requestConfig.method, url, headers)
        if (body != null)
            LOG.debug("[{}] {} | body: {}", requestConfig.method, url, body.toString())

        if (clientConfig.authHeader != null) {
            headers[Authorization] = clientConfig.authHeader
        }

        if (headers[ContentType] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Content-Type header. This is required.")
        }
        if(headers[Accept] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Accept header. This is required.")
        }

        if (headers[Accept] ?: "" == "") {
            throw kotlin.IllegalStateException("Missing Accept header. This is required.")
        }

        // TODO: support multiple contentType,accept options here.
        val contentType = (headers[ContentType] as String).substringBefore(";").toLowerCase()
        val accept = (headers[Accept] as String).substringBefore(";").toLowerCase()

        var request: Request.Builder = Request.Builder().url(url)
        when (requestConfig.method) {
            RequestMethod.DELETE -> request.delete()
            RequestMethod.GET -> request // just to illustrate we do nothing special about GET requests
            RequestMethod.HEAD -> request.head()
            RequestMethod.PATCH -> request.patch(requestBody(body, contentType))
            RequestMethod.PUT -> request.put(requestBody(body, contentType))
            RequestMethod.POST -> request.post(requestBody(body, contentType))
            RequestMethod.OPTIONS -> request.method("OPTIONS", null)
        }

        headers.forEach { header -> request = request.addHeader(header.key, header.value) }

        val realRequest = request.build()
        val response = client.newCall(realRequest).execute()

        // TODO: handle specific mapping types. e.g. Map<int, Class<?>>
        when {
            response.isRedirect -> return Redirection(
                    response.code(),
                    response.headers().toMultimap()
            )
            response.isInformational -> return Informational(
                    response.message(),
                    response.code(),
                    response.headers().toMultimap()
            )
            response.isSuccessful -> return Success(
                    responseBody(response, accept),
                    response.code(),
                    response.headers().toMultimap()
            )
            response.isClientError -> return ClientError(
                    response.body()?.string(),
                    response.code(),
                    response.headers().toMultimap()
            )
            else -> return ServerError(
                    null,
                    response.body()?.string(),
                    response.code(),
                    response.headers().toMultimap()
            )
        }
    }

    @Throws(IOException::class)
    fun downloadFileFromResponse(response: Response): File {
        val file = prepareDownloadFile(response)

        response.body()?.byteStream().use { input ->
            File(file.path).outputStream().use { input?.copyTo(it) }
        }

        return file
    }

    @Throws(IOException::class)
    fun prepareDownloadFile(response: Response): File {
        var filename: String? = null
        val contentDisposition = response.headers().get("Content-Disposition")

        if (contentDisposition != null && contentDisposition != "") {
            val pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?")
            val matcher = pattern.matcher(contentDisposition)

            if (matcher.find())
                filename = matcher.group(1)
        }
        var prefix: String
        var suffix: String? = null

        if (filename == null) {
            prefix = "download-"
            suffix = ""
        } else {
            val pos = filename.lastIndexOf('.')

            if (pos == -1) {
                prefix = "$filename-";
            } else {
                prefix = filename.substring(0, pos) + "-"
                suffix = filename.substring(pos)
            }
            // File.createTempFile requires the prefix to be at least three characters long
            if (prefix.length < 3)
                prefix = "download-"
        }

        return File.createTempFile(prefix, suffix)
    }
}