package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class AgentPoolApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Assign the agent to the matching agent pool.
    * Runs POST request on "/app/rest/agentPools/{agentPoolLocator}/agents" endpoint.
    * @param agentPoolLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Agent
    */
    fun addAgentToAgentPool(
                    agentPoolLocator: String,
                    body: Agent? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Agent {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/agentPools/{agentPoolLocator}/agents".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Agent>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Assign the project to the matching agent pool.
    * Runs POST request on "/app/rest/agentPools/{agentPoolLocator}/projects" endpoint.
    * @param agentPoolLocator  
    * @param body  (optional)
    * @return Project
    */
    fun addProjectToAgentPool(
                    agentPoolLocator: String,
                    body: Project? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Project {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/agentPools/{agentPoolLocator}/projects".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Project>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create a new agent pool.
    * Runs POST request on "/app/rest/agentPools" endpoint.
    * @param body  (optional)
    * @return AgentPool
    */
    fun createAgentPool(
                    body: AgentPool? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPool {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/agentPools",
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
    * Delete the agent pool matching the locator.
    * Runs DELETE request on "/app/rest/agentPools/{agentPoolLocator}" endpoint.
    * @param agentPoolLocator  
    * @return Unit
    */
    fun deleteAgentPool(
                    agentPoolLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/agentPools/{agentPoolLocator}".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Unassign all projects from the matching agent pool.
    * Runs DELETE request on "/app/rest/agentPools/{agentPoolLocator}/projects" endpoint.
    * @param agentPoolLocator  
    * @return Unit
    */
    fun deleteAllProjectsFromAgentPool(
                    agentPoolLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/agentPools/{agentPoolLocator}/projects".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Unassign the project from the matching agent pool.
    * Runs DELETE request on "/app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}" endpoint.
    * @param agentPoolLocator  
    * @param projectLocator  
    * @return Unit
    */
    fun deleteProjectFromAgentPool(
                    agentPoolLocator: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the agent pool matching the locator.
    * Runs GET request on "/app/rest/agentPools/{agentPoolLocator}" endpoint.
    * @param agentPoolLocator  
    * @param fields  (optional)
    * @return AgentPool
    */
    fun getAgentPoolOfAgentPool(
                    agentPoolLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPool {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agentPools/{agentPoolLocator}".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPool>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all agent pools.
    * Runs GET request on "/app/rest/agentPools" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return AgentPools
    */
    fun getAllAgentPools(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPools {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agentPools",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPools>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the agent of the matching agent pool.
    * Runs GET request on "/app/rest/agentPools/{agentPoolLocator}/agents" endpoint.
    * @param agentPoolLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Agents
    */
    fun getAllAgentsFromAgentPool(
                    agentPoolLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Agents {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agentPools/{agentPoolLocator}/agents".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Agents>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all projects of the matching agent pool.
    * Runs GET request on "/app/rest/agentPools/{agentPoolLocator}/projects" endpoint.
    * @param agentPoolLocator  
    * @param fields  (optional)
    * @return Projects
    */
    fun getAllProjectsFromAgentPool(
                    agentPoolLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Projects {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agentPools/{agentPoolLocator}/projects".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Projects>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching agent pool.
    * Runs GET request on "/app/rest/agentPools/{agentPoolLocator}/{field}" endpoint.
    * @param agentPoolLocator  
    * @param field  
    * @return String
    */
    fun getFieldFromAgentPool(
                    agentPoolLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/agentPools/{agentPoolLocator}/{field}".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update a field of the matching agent pool.
    * Runs PUT request on "/app/rest/agentPools/{agentPoolLocator}/{field}" endpoint.
    * @param agentPoolLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setAgentPoolField(
                    agentPoolLocator: String,
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
            "/app/rest/agentPools/{agentPoolLocator}/{field}".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator").replace("{"+"field"+"}", "$field"),
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
    * Update projects of the matching agent pool.
    * Runs PUT request on "/app/rest/agentPools/{agentPoolLocator}/projects" endpoint.
    * @param agentPoolLocator  
    * @param body  (optional)
    * @return Projects
    */
    fun setAgentPoolProjects(
                    agentPoolLocator: String,
                    body: Projects? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Projects {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/agentPools/{agentPoolLocator}/projects".replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Projects>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
