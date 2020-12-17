package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class ServerApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add license keys.
    * Runs POST request on "/app/rest/server/licensingData/licenseKeys" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return LicenseKeys
    */
    fun addLicenseKeys(
                    body: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : LicenseKeys {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/server/licensingData/licenseKeys",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<LicenseKeys>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete a license key.
    * Runs DELETE request on "/app/rest/server/licensingData/licenseKeys/{licenseKey}" endpoint.
    * @param licenseKey  
    * @return Unit
    */
    fun deleteLicenseKey(
                    licenseKey: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/server/licensingData/licenseKeys/{licenseKey}".replace("{"+"licenseKey"+"}", "$licenseKey"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Download specific file.
    * Runs GET request on "/app/rest/server/files/{areaId}/files{path}" endpoint.
    * @param path  
    * @param areaId  
    * @return Unit
    */
    fun downloadFileOfServer(
                    path: String,
                    areaId: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/files/{areaId}/files{path}".replace("{"+"path"+"}", "$path").replace("{"+"areaId"+"}", "$areaId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get metrics.
    * Runs GET request on "/app/rest/server/metrics" endpoint.
    * @param fields  (optional)
    * @return Metrics
    */
    fun getAllMetrics(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Metrics {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/metrics",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Metrics>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all plugins.
    * Runs GET request on "/app/rest/server/plugins" endpoint.
    * @param fields  (optional)
    * @return Plugins
    */
    fun getAllPlugins(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Plugins {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/plugins",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Plugins>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the latest backup status.
    * Runs GET request on "/app/rest/server/backup" endpoint.
    * @return String
    */
    fun getBackupStatus(
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/backup",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get metadata of specific file.
    * Runs GET request on "/app/rest/server/files/{areaId}/metadata{path}" endpoint.
    * @param path  
    * @param areaId  
    * @param fields  (optional)
    * @return File
    */
    fun getFileMetadataOfServer(
                    path: String,
                    areaId: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : File {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/files/{areaId}/metadata{path}".replace("{"+"path"+"}", "$path").replace("{"+"areaId"+"}", "$areaId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<File>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List files under this path.
    * Runs GET request on "/app/rest/server/files/{areaId}/{path}" endpoint.
    * @param path  
    * @param areaId  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Files
    */
    fun getFilesListForSubpathOfServer(
                    path: String,
                    areaId: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/files/{areaId}/{path}".replace("{"+"path"+"}", "$path").replace("{"+"areaId"+"}", "$areaId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List all files.
    * Runs GET request on "/app/rest/server/files/{areaId}" endpoint.
    * @param areaId  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Files
    */
    fun getFilesListOfServer(
                    areaId: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/files/{areaId}".replace("{"+"areaId"+"}", "$areaId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a license key.
    * Runs GET request on "/app/rest/server/licensingData/licenseKeys/{licenseKey}" endpoint.
    * @param licenseKey  
    * @param fields  (optional)
    * @return LicenseKey
    */
    fun getLicenseKey(
                    licenseKey: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : LicenseKey {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/licensingData/licenseKeys/{licenseKey}".replace("{"+"licenseKey"+"}", "$licenseKey"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<LicenseKey>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all license keys.
    * Runs GET request on "/app/rest/server/licensingData/licenseKeys" endpoint.
    * @param fields  (optional)
    * @return LicenseKeys
    */
    fun getLicenseKeys(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : LicenseKeys {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/licensingData/licenseKeys",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<LicenseKeys>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the licensing data.
    * Runs GET request on "/app/rest/server/licensingData" endpoint.
    * @param fields  (optional)
    * @return LicensingData
    */
    fun getLicensingData(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : LicensingData {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/licensingData",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<LicensingData>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the server info.
    * Runs GET request on "/app/rest/server/{field}" endpoint.
    * @param field  
    * @return String
    */
    fun getServerField(
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/{field}".replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the server info.
    * Runs GET request on "/app/rest/server" endpoint.
    * @param fields  (optional)
    * @return Server
    */
    fun getServerInfo(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Server {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Server>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get specific file zipped.
    * Runs GET request on "/app/rest/server/files/{areaId}/archived{path}" endpoint.
    * @param path  
    * @param areaId  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param name  (optional)
    * @return Unit
    */
    fun getZippedFileOfServer(
                    path: String,
                    areaId: String,
                    basePath: String? = null,
                    locator: String? = null,
                    name: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        name?.let { localQuery["name"] = listOf("$name") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/server/files/{areaId}/archived{path}".replace("{"+"path"+"}", "$path").replace("{"+"areaId"+"}", "$areaId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Start a new backup.
    * Runs POST request on "/app/rest/server/backup" endpoint.
    * @param fileName  (optional)
    * @param addTimestamp  (optional)
    * @param includeConfigs  (optional)
    * @param includeDatabase  (optional)
    * @param includeBuildLogs  (optional)
    * @param includePersonalChanges  (optional)
    * @param includeRunningBuilds  (optional)
    * @param includeSupplimentaryData  (optional)
    * @return String
    */
    fun startBackup(
                    fileName: String? = null,
                    addTimestamp: Boolean? = null,
                    includeConfigs: Boolean? = null,
                    includeDatabase: Boolean? = null,
                    includeBuildLogs: Boolean? = null,
                    includePersonalChanges: Boolean? = null,
                    includeRunningBuilds: Boolean? = null,
                    includeSupplimentaryData: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fileName?.let { localQuery["fileName"] = listOf("$fileName") }
        addTimestamp?.let { localQuery["addTimestamp"] = listOf("$addTimestamp") }
        includeConfigs?.let { localQuery["includeConfigs"] = listOf("$includeConfigs") }
        includeDatabase?.let { localQuery["includeDatabase"] = listOf("$includeDatabase") }
        includeBuildLogs?.let { localQuery["includeBuildLogs"] = listOf("$includeBuildLogs") }
        includePersonalChanges?.let { localQuery["includePersonalChanges"] = listOf("$includePersonalChanges") }
        includeRunningBuilds?.let { localQuery["includeRunningBuilds"] = listOf("$includeRunningBuilds") }
        includeSupplimentaryData?.let { localQuery["includeSupplimentaryData"] = listOf("$includeSupplimentaryData") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/server/backup",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
