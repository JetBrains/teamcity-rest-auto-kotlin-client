package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class TestApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get a matching test.
    * Runs GET request on "/app/rest/tests/{testLocator}" endpoint.
    * @param testLocator  
    * @param fields  (optional)
    * @return Test
    */
    fun getTest(
                    testLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Test {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/tests/{testLocator}".replace("{"+"testLocator"+"}", "$testLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Test>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all tests.
    * Runs GET request on "/app/rest/tests" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Tests
    */
    fun getTests(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tests {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/tests",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tests>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
