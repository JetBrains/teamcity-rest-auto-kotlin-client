package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class ProblemApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all build problems.
    * Runs GET request on "/app/rest/problems" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Problems
    */
    fun getAllBuildProblems(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Problems {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/problems",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Problems>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a matching build problem.
    * Runs GET request on "/app/rest/problems/{problemLocator}" endpoint.
    * @param problemLocator  
    * @param fields  (optional)
    * @return Problem
    */
    fun getBuildProblem(
                    problemLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Problem {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/problems/{problemLocator}".replace("{"+"problemLocator"+"}", "$problemLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Problem>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
