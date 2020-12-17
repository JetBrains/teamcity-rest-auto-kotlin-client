package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class ProblemOccurrenceApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all build problem occurrences.
    * Runs GET request on "/app/rest/problemOccurrences" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return ProblemOccurrences
    */
    fun getAllBuildProblemOccurrences(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ProblemOccurrences {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/problemOccurrences",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ProblemOccurrences>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a matching build problem occurrence.
    * Runs GET request on "/app/rest/problemOccurrences/{problemLocator}" endpoint.
    * @param problemLocator  
    * @param fields  (optional)
    * @return ProblemOccurrence
    */
    fun getBuildProblemOccurrence(
                    problemLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ProblemOccurrence {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/problemOccurrences/{problemLocator}".replace("{"+"problemLocator"+"}", "$problemLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ProblemOccurrence>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
