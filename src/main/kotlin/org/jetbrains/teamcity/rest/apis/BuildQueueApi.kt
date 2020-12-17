package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class BuildQueueApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add a new build to the queue.
    * Runs POST request on "/app/rest/buildQueue" endpoint.
    * @param body  (optional)
    * @param moveToTop  (optional)
    * @return Build
    */
    fun addBuildToQueue(
                    body: Build? = null,
                    moveToTop: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        moveToTop?.let { localQuery["moveToTop"] = listOf("$moveToTop") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildQueue",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add tags to the matching build.
    * Runs POST request on "/app/rest/buildQueue/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @return Unit
    */
    fun addTagsToBuildOfBuildQueue(
                    buildLocator: String,
                    body: Tags? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildQueue/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Cancel a queued matching build.
    * Runs POST request on "/app/rest/buildQueue/{queuedBuildLocator}" endpoint.
    * @param queuedBuildLocator  
    * @param body  (optional)
    * @return Build
    */
    fun cancelQueuedBuild(
                    queuedBuildLocator: String,
                    body: BuildCancelRequest? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildQueue/{queuedBuildLocator}".replace("{"+"queuedBuildLocator"+"}", "$queuedBuildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete all queued builds.
    * Runs DELETE request on "/app/rest/buildQueue" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Unit
    */
    fun deleteAllQueuedBuilds(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildQueue",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a queued matching build.
    * Runs DELETE request on "/app/rest/buildQueue/{queuedBuildLocator}" endpoint.
    * @param queuedBuildLocator  
    * @return Unit
    */
    fun deleteQueuedBuild(
                    queuedBuildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildQueue/{queuedBuildLocator}".replace("{"+"queuedBuildLocator"+"}", "$queuedBuildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all queued builds.
    * Runs GET request on "/app/rest/buildQueue" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Builds
    */
    fun getAllQueuedBuilds(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildQueue",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get compatible agents for a queued matching build.
    * Runs GET request on "/app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents" endpoint.
    * @param queuedBuildLocator  
    * @param fields  (optional)
    * @return Agents
    */
    fun getCompatibleAgentsForBuild(
                    queuedBuildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Agents {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents".replace("{"+"queuedBuildLocator"+"}", "$queuedBuildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Agents>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a queued matching build.
    * Runs GET request on "/app/rest/buildQueue/{queuedBuildLocator}" endpoint.
    * @param queuedBuildLocator  
    * @param fields  (optional)
    * @return Build
    */
    fun getQueuedBuild(
                    queuedBuildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildQueue/{queuedBuildLocator}".replace("{"+"queuedBuildLocator"+"}", "$queuedBuildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the queue position of a queued matching build.
    * Runs GET request on "/app/rest/buildQueue/order/{queuePosition}" endpoint.
    * @param queuePosition  
    * @param fields  (optional)
    * @return Build
    */
    fun getQueuedBuildPosition(
                    queuePosition: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildQueue/order/{queuePosition}".replace("{"+"queuePosition"+"}", "$queuePosition"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get tags of the queued matching build.
    * Runs GET request on "/app/rest/buildQueue/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Tags
    */
    fun getQueuedBuildTags(
                    buildLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tags {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildQueue/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tags>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update the queue position of a queued matching build.
    * Runs PUT request on "/app/rest/buildQueue/order/{queuePosition}" endpoint.
    * @param queuePosition  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Build
    */
    fun setQueuedBuildPosition(
                    queuePosition: String,
                    body: Build? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildQueue/order/{queuePosition}".replace("{"+"queuePosition"+"}", "$queuePosition"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the build queue order.
    * Runs PUT request on "/app/rest/buildQueue/order" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Builds
    */
    fun setQueuedBuildsOrder(
                    body: Builds? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildQueue/order",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
