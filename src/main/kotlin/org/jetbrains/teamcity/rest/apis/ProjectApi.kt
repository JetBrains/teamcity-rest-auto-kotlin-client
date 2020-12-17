package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class ProjectApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Assign the matching project to the agent pool.
    * Runs POST request on "/app/rest/projects/{projectLocator}/agentPools" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @return AgentPool
    */
    fun addAgentPoolsProject(
                    projectLocator: String,
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
            "/app/rest/projects/{projectLocator}/agentPools".replace("{"+"projectLocator"+"}", "$projectLocator"),
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
    * Add a build configuration to the matching project.
    * Runs POST request on "/app/rest/projects/{projectLocator}/buildTypes" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return BuildType
    */
    fun addBuildType(
                    projectLocator: String,
                    body: NewBuildTypeDescription? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/projects/{projectLocator}/buildTypes".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a feature.
    * Runs POST request on "/app/rest/projects/{projectLocator}/projectFeatures" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Any
    */
    fun addFeature(
                    projectLocator: String,
                    body: ProjectFeature? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Any {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/projects/{projectLocator}/projectFeatures".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Any>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create a new project.
    * Runs POST request on "/app/rest/projects" endpoint.
    * @param body  (optional)
    * @return Project
    */
    fun addProject(
                    body: NewProjectDescription? = null,
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
            "/app/rest/projects",
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
    * Create a new secure token for the matching project.
    * Runs POST request on "/app/rest/projects/{projectLocator}/secure/tokens" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @return String
    */
    fun addSecureToken(
                    projectLocator: String,
                    body: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/projects/{projectLocator}/secure/tokens".replace("{"+"projectLocator"+"}", "$projectLocator"),
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
    * Add a build configuration template to the matching project.
    * Runs POST request on "/app/rest/projects/{projectLocator}/templates" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return BuildType
    */
    fun addTemplate(
                    projectLocator: String,
                    body: NewBuildTypeDescription? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/projects/{projectLocator}/templates".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create a build parameter.
    * Runs POST request on "/app/rest/projects/{projectLocator}/parameters" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Property
    */
    fun createBuildParameter(
                    projectLocator: String,
                    body: Property? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Property {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/projects/{projectLocator}/parameters".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Property>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete build parameter.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param projectLocator  
    * @return Unit
    */
    fun deleteBuildParameter(
                    name: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete all build parameters.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}/parameters" endpoint.
    * @param projectLocator  
    * @return Unit
    */
    fun deleteBuildParameters(
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}/parameters".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a matching feature.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}" endpoint.
    * @param featureLocator  
    * @param projectLocator  
    * @return Unit
    */
    fun deleteFeature(
                    featureLocator: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}".replace("{"+"featureLocator"+"}", "$featureLocator").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete project matching the locator.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}" endpoint.
    * @param projectLocator  
    * @return Unit
    */
    fun deleteProject(
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get agent pools appointed to the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/agentPools" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return AgentPools
    */
    fun getAgentPoolsProject(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPools {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/agentPools".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPools>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all branches of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/branches" endpoint.
    * @param projectLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Branches
    */
    fun getAllBranches(
                    projectLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Branches {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/branches".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Branches>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all projects.
    * Runs GET request on "/app/rest/projects" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Projects
    */
    fun getAllProjects(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Projects {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Projects>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all subprojects ordered of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/order/projects" endpoint.
    * @param projectLocator  
    * @param field  (optional)
    * @return Projects
    */
    fun getAllSubprojectsOrdered(
                    projectLocator: String,
                    field: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Projects {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        field?.let { localQuery["field"] = listOf("$field") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/order/projects".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Projects>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build parameter.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param projectLocator  
    * @param fields  (optional)
    * @return Property
    */
    fun getBuildParameter(
                    name: String,
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Property {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Property>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build parameter specification.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue" endpoint.
    * @param name  
    * @param projectLocator  
    * @return String
    */
    fun getBuildParameterSpecification(
                    name: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get type of build parameter.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parameters/{name}/type" endpoint.
    * @param name  
    * @param projectLocator  
    * @return Type
    */
    fun getBuildParameterType(
                    name: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Type {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parameters/{name}/type".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Type>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get value of build parameter.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parameters/{name}/value" endpoint.
    * @param name  
    * @param projectLocator  
    * @return String
    */
    fun getBuildParameterValue(
                    name: String,
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parameters/{name}/value".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build parameters.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parameters" endpoint.
    * @param projectLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun getBuildParameters(
                    projectLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parameters".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the default template of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/defaultTemplate" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return BuildType
    */
    fun getDefaultTemplate(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/defaultTemplate".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a matching feature.
    * Runs GET request on "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}" endpoint.
    * @param featureLocator  
    * @param projectLocator  
    * @param fields  (optional)
    * @return Any
    */
    fun getFeature(
                    featureLocator: String,
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Any {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}".replace("{"+"featureLocator"+"}", "$featureLocator").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Any>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all features.
    * Runs GET request on "/app/rest/projects/{projectLocator}/projectFeatures" endpoint.
    * @param projectLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Any
    */
    fun getFeatures(
                    projectLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Any {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/projectFeatures".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Any>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get project matching the locator.
    * Runs GET request on "/app/rest/projects/{projectLocator}" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return Project
    */
    fun getProject(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Project {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Project>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/{field}" endpoint.
    * @param projectLocator  
    * @param field  
    * @return String
    */
    fun getProjectField(
                    projectLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/{field}".replace("{"+"projectLocator"+"}", "$projectLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the parent project of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/parentProject" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return Project
    */
    fun getProjectParentProject(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Project {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/parentProject".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Project>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the settings file of the matching build configuration.
    * Runs GET request on "/app/rest/projects/{projectLocator}/settingsFile" endpoint.
    * @param projectLocator  
    * @return String
    */
    fun getProjectSettingsFile(
                    projectLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/settingsFile".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all templates of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/templates" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun getProjectTemplates(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/templates".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a secure token of the matching project.
    * Runs GET request on "/app/rest/projects/{projectLocator}/secure/values/{token}" endpoint.
    * @param projectLocator  
    * @param token  
    * @return String
    */
    fun getSecureValue(
                    projectLocator: String,
                    token: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/projects/{projectLocator}/secure/values/{token}".replace("{"+"projectLocator"+"}", "$projectLocator").replace("{"+"token"+"}", "$token"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove the default template from the matching project.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}/defaultTemplate" endpoint.
    * @param projectLocator  
    * @param fields  (optional)
    * @return Unit
    */
    fun removeDefaultTemplate(
                    projectLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}/defaultTemplate".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Unassign a project from the matching agent pool.
    * Runs DELETE request on "/app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator}" endpoint.
    * @param projectLocator  
    * @param agentPoolLocator  
    * @return Unit
    */
    fun removeProjectFromAgentPool(
                    projectLocator: String,
                    agentPoolLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator}".replace("{"+"projectLocator"+"}", "$projectLocator").replace("{"+"agentPoolLocator"+"}", "$agentPoolLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update agent pools apppointed to the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/agentPools" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return AgentPools
    */
    fun setAgentPoolsProject(
                    projectLocator: String,
                    body: AgentPools? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentPools {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/agentPools".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentPools>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all build configurations order of the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/order/buildTypes" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param field  (optional)
    * @return BuildTypes
    */
    fun setBuildTypesOrder(
                    projectLocator: String,
                    body: BuildTypes? = null,
                    field: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        field?.let { localQuery["field"] = listOf("$field") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/order/buildTypes".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the default template of the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/defaultTemplate" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return BuildType
    */
    fun setDefaultTemplate(
                    projectLocator: String,
                    body: BuildType? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/defaultTemplate".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the parent project of the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parentProject" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Project
    */
    fun setParentProject(
                    projectLocator: String,
                    body: Project? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Project {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/parentProject".replace("{"+"projectLocator"+"}", "$projectLocator"),
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
    * Update a field of the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/{field}" endpoint.
    * @param projectLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setProjectField(
                    projectLocator: String,
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
            "/app/rest/projects/{projectLocator}/{field}".replace("{"+"projectLocator"+"}", "$projectLocator").replace("{"+"field"+"}", "$field"),
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
    * Update all subprojects order of the matching project.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/order/projects" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param field  (optional)
    * @return Projects
    */
    fun setSubprojectsOrder(
                    projectLocator: String,
                    body: Projects? = null,
                    field: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Projects {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        field?.let { localQuery["field"] = listOf("$field") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/order/projects".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Projects>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update build parameter.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Property
    */
    fun updateBuildParameter(
                    name: String,
                    projectLocator: String,
                    body: Property? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Property {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Property>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update build parameter specification.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue" endpoint.
    * @param name  
    * @param projectLocator  
    * @param body  (optional)
    * @return String
    */
    fun updateBuildParameterSpecification(
                    name: String,
                    projectLocator: String,
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
            "/app/rest/projects/{projectLocator}/parameters/{name}/type/rawValue".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
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
    * Update type of build parameter.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parameters/{name}/type" endpoint.
    * @param name  
    * @param projectLocator  
    * @param body  (optional)
    * @return Type
    */
    fun updateBuildParameterType(
                    name: String,
                    projectLocator: String,
                    body: Type? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Type {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/parameters/{name}/type".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Type>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update value of build parameter.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parameters/{name}/value" endpoint.
    * @param name  
    * @param projectLocator  
    * @param body  (optional)
    * @return String
    */
    fun updateBuildParameterValue(
                    name: String,
                    projectLocator: String,
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
            "/app/rest/projects/{projectLocator}/parameters/{name}/value".replace("{"+"name"+"}", "$name").replace("{"+"projectLocator"+"}", "$projectLocator"),
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
    * Update build parameters.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/parameters" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun updateBuildParameters(
                    projectLocator: String,
                    body: Properties? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/parameters".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a matching feature.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}" endpoint.
    * @param featureLocator  
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Any
    */
    fun updateFeature(
                    featureLocator: String,
                    projectLocator: String,
                    body: ProjectFeature? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Any {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/projectFeatures/{featureLocator}".replace("{"+"featureLocator"+"}", "$featureLocator").replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Any>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all features.
    * Runs PUT request on "/app/rest/projects/{projectLocator}/projectFeatures" endpoint.
    * @param projectLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Any
    */
    fun updateFeatures(
                    projectLocator: String,
                    body: ProjectFeatures? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Any {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/projects/{projectLocator}/projectFeatures".replace("{"+"projectLocator"+"}", "$projectLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Any>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
