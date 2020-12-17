package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class CloudInstanceApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all cloud images.
    * Runs GET request on "/app/rest/cloud/images" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return CloudImages
    */
    fun getAllCloudImages(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudImages {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/images",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudImages>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all cloud instances.
    * Runs GET request on "/app/rest/cloud/instances" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return CloudInstances
    */
    fun getAllCloudInstances(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudInstances {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/instances",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudInstances>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all cloud profiles.
    * Runs GET request on "/app/rest/cloud/profiles" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return CloudProfiles
    */
    fun getAllCloudProfiles(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudProfiles {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/profiles",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudProfiles>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get cloud image matching the locator.
    * Runs GET request on "/app/rest/cloud/images/{imageLocator}" endpoint.
    * @param imageLocator  
    * @param fields  (optional)
    * @return CloudImage
    */
    fun getCloudImage(
                    imageLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudImage {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/images/{imageLocator}".replace("{"+"imageLocator"+"}", "$imageLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudImage>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get cloud instance matching the locator.
    * Runs GET request on "/app/rest/cloud/instances/{instanceLocator}" endpoint.
    * @param instanceLocator  
    * @param fields  (optional)
    * @return CloudInstance
    */
    fun getCloudInstance(
                    instanceLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudInstance {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/instances/{instanceLocator}".replace("{"+"instanceLocator"+"}", "$instanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudInstance>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get cloud profile matching the locator.
    * Runs GET request on "/app/rest/cloud/profiles/{profileLocator}" endpoint.
    * @param profileLocator  
    * @param fields  (optional)
    * @return CloudProfile
    */
    fun getCloudProfile(
                    profileLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CloudProfile {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/cloud/profiles/{profileLocator}".replace("{"+"profileLocator"+"}", "$profileLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CloudProfile>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Start a new cloud instance.
    * Runs POST request on "/app/rest/cloud/instances" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Unit
    */
    fun startInstance(
                    body: CloudInstance? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/cloud/instances",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Stop cloud instance matching the locator.
    * Runs DELETE request on "/app/rest/cloud/instances/{instanceLocator}" endpoint.
    * @param instanceLocator  
    * @return Unit
    */
    fun stopInstance(
                    instanceLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/cloud/instances/{instanceLocator}".replace("{"+"instanceLocator"+"}", "$instanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
