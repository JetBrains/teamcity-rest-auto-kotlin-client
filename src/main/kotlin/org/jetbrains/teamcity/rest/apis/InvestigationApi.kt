package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class InvestigationApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Create a new investigation.
    * Runs POST request on "/app/rest/investigations" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Investigation
    */
    fun addInvestigation(
                    body: Investigation? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigation {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/investigations",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigation>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create multiple new investigations.
    * Runs POST request on "/app/rest/investigations/multiple" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Investigations
    */
    fun addMultipleInvestigations(
                    body: Investigations? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigations {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/investigations/multiple",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigations>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete investigation matching the locator.
    * Runs DELETE request on "/app/rest/investigations/{investigationLocator}" endpoint.
    * @param investigationLocator  
    * @return Unit
    */
    fun deleteInvestigation(
                    investigationLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/investigations/{investigationLocator}".replace("{"+"investigationLocator"+"}", "$investigationLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all investigations.
    * Runs GET request on "/app/rest/investigations" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Investigations
    */
    fun getAllInvestigations(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigations {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/investigations",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigations>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get investigation matching the locator.
    * Runs GET request on "/app/rest/investigations/{investigationLocator}" endpoint.
    * @param investigationLocator  
    * @param fields  (optional)
    * @return Investigation
    */
    fun getInvestigation(
                    investigationLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigation {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/investigations/{investigationLocator}".replace("{"+"investigationLocator"+"}", "$investigationLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigation>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update investigation matching the locator.
    * Runs PUT request on "/app/rest/investigations/{investigationLocator}" endpoint.
    * @param investigationLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Investigation
    */
    fun replaceInvestigation(
                    investigationLocator: String,
                    body: Investigation? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigation {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/investigations/{investigationLocator}".replace("{"+"investigationLocator"+"}", "$investigationLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigation>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
