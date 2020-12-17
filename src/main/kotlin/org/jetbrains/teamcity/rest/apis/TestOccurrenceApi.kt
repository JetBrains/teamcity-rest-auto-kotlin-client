package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class TestOccurrenceApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all test occurrences.
    * Runs GET request on "/app/rest/testOccurrences" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return TestOccurrences
    */
    fun getAllTestOccurrences(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : TestOccurrences {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/testOccurrences",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<TestOccurrences>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a matching test occurrence.
    * Runs GET request on "/app/rest/testOccurrences/{testLocator}" endpoint.
    * @param testLocator  
    * @param fields  (optional)
    * @return TestOccurrence
    */
    fun getTestOccurrence(
                    testLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : TestOccurrence {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/testOccurrences/{testLocator}".replace("{"+"testLocator"+"}", "$testLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<TestOccurrence>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
