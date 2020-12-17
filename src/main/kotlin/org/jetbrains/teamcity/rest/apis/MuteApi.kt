package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class MuteApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all muted tests.
    * Runs GET request on "/app/rest/mutes" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Mutes
    */
    fun getAllMutedTests(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Mutes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/mutes",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Mutes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a muted test.
    * Runs GET request on "/app/rest/mutes/{muteLocator}" endpoint.
    * @param muteLocator  
    * @param fields  (optional)
    * @return Mute
    */
    fun getMutedTest(
                    muteLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Mute {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/mutes/{muteLocator}".replace("{"+"muteLocator"+"}", "$muteLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Mute>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Mute multiple tests.
    * Runs POST request on "/app/rest/mutes/multiple" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Mutes
    */
    fun muteMultipleTests(
                    body: Mutes? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Mutes {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/mutes/multiple",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Mutes>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Mute a test.
    * Runs POST request on "/app/rest/mutes" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Mute
    */
    fun muteTest(
                    body: Mute? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Mute {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/mutes",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Mute>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Unmute the matching test.
    * Runs DELETE request on "/app/rest/mutes/{muteLocator}" endpoint.
    * @param muteLocator  
    * @param body  (optional)
    * @return Unit
    */
    fun unmuteTest(
                    muteLocator: String,
                    body: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/mutes/{muteLocator}".replace("{"+"muteLocator"+"}", "$muteLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
