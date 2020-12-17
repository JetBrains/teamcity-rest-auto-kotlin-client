package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class AgentApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Delete an inactive agent.
    * Runs DELETE request on "/app/rest/agents/{agentLocator}" endpoint.
    * @param agentLocator  
    * @return Unit
    */
    fun deleteAgent(
                    agentLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/agents/{agentLocator}".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get agent matching the locator.
    * Runs GET request on "/app/rest/agents/{agentLocator}" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return Agent
    */
    fun getAgent(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Agent {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Agent>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/{field}" endpoint.
    * @param agentLocator  
    * @param field  
    * @return String
    */
    fun getAgentField(
                    agentLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/{field}".replace("{"+"agentLocator"+"}", "$agentLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the agent pool of the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/pool" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return AgentPool
    */
    fun getAgentPool(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPool {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/pool".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPool>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all known agents.
    * Runs GET request on "/app/rest/agents" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Agents
    */
    fun getAllAgents(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Agents {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Agents>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the authorization info of the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/authorizedInfo" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return AuthorizedInfo
    */
    fun getAuthorizedInfo(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AuthorizedInfo {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/authorizedInfo".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AuthorizedInfo>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the build configuration run policy of the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/compatibilityPolicy" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return CompatibilityPolicy
    */
    fun getBuildConfigurationRunPolicy(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CompatibilityPolicy {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/compatibilityPolicy".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CompatibilityPolicy>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build types compatible with the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/compatibleBuildTypes" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun getCompatibleBuildTypes(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/compatibleBuildTypes".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Check if the matching agent is enabled.
    * Runs GET request on "/app/rest/agents/{agentLocator}/enabledInfo" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return EnabledInfo
    */
    fun getEnabledInfo(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : EnabledInfo {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/enabledInfo".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<EnabledInfo>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build types incompatible with the matching agent.
    * Runs GET request on "/app/rest/agents/{agentLocator}/incompatibleBuildTypes" endpoint.
    * @param agentLocator  
    * @param fields  (optional)
    * @return Compatibilities
    */
    fun getIncompatibleBuildTypes(
                    agentLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Compatibilities {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agents/{agentLocator}/incompatibleBuildTypes".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Compatibilities>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update a field of the matching agent.
    * Runs PUT request on "/app/rest/agents/{agentLocator}/{field}" endpoint.
    * @param agentLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setAgentField(
                    agentLocator: String,
                    field: String,
                    body: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agents/{agentLocator}/{field}".replace("{"+"agentLocator"+"}", "$agentLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Assign the matching agent to the specified agent pool.
    * Runs PUT request on "/app/rest/agents/{agentLocator}/pool" endpoint.
    * @param agentLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return AgentPool
    */
    fun setAgentPool(
                    agentLocator: String,
                    body: AgentPool? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPool {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agents/{agentLocator}/pool".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPool>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the authorization info of the matching agent.
    * Runs PUT request on "/app/rest/agents/{agentLocator}/authorizedInfo" endpoint.
    * @param agentLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return AuthorizedInfo
    */
    fun setAuthorizedInfo(
                    agentLocator: String,
                    body: AuthorizedInfo? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AuthorizedInfo {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agents/{agentLocator}/authorizedInfo".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AuthorizedInfo>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update build configuration run policy of agent matching locator.
    * Runs PUT request on "/app/rest/agents/{agentLocator}/compatibilityPolicy" endpoint.
    * @param agentLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return CompatibilityPolicy
    */
    fun setBuildConfigurationRunPolicy(
                    agentLocator: String,
                    body: CompatibilityPolicy? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : CompatibilityPolicy {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agents/{agentLocator}/compatibilityPolicy".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<CompatibilityPolicy>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the enablement status of the matching agent.
    * Runs PUT request on "/app/rest/agents/{agentLocator}/enabledInfo" endpoint.
    * @param agentLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return EnabledInfo
    */
    fun setEnabledInfo(
                    agentLocator: String,
                    body: EnabledInfo? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : EnabledInfo {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agents/{agentLocator}/enabledInfo".replace("{"+"agentLocator"+"}", "$agentLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<EnabledInfo>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
