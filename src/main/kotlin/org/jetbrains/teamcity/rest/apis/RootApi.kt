package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class RootApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get the API version.
    * Runs GET request on "/app/rest/apiVersion" endpoint.
    * @return String
    */
    fun getApiVersion(
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/apiVersion",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the plugin info.
    * Runs GET request on "/app/rest/info" endpoint.
    * @param fields  (optional)
    * @return Plugin
    */
    fun getPluginInfo(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Plugin {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/info",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Plugin>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get root endpoints.
    * Runs GET request on "/app/rest" endpoint.
    * @return String
    */
    fun getRootEndpointsOfRoot(
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the TeamCity server version.
    * Runs GET request on "/app/rest/version" endpoint.
    * @return String
    */
    fun getVersion(
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/version",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
