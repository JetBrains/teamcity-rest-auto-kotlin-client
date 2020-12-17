package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class BuildTypeApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add an agent requirement to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/agent-requirements" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return AgentRequirement
    */
    fun addAgentRequirementToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: AgentRequirement? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentRequirement {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/agent-requirements".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentRequirement>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add an artifact dependency to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return ArtifactDependency
    */
    fun addArtifactDependencyToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: ArtifactDependency? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ArtifactDependency {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ArtifactDependency>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add build feature to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/features" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Feature
    */
    fun addBuildFeatureToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: Feature? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Feature {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/features".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Feature>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a build step to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/steps" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Step
    */
    fun addBuildStepToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: Step? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Step {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/steps".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Step>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a build template to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/templates" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param optimizeSettings  (optional)
    * @param fields  (optional)
    * @return BuildType
    */
    fun addBuildTemplate(
                    btLocator: String,
                    body: BuildType? = null,
                    optimizeSettings: Boolean? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        optimizeSettings?.let { localQuery["optimizeSettings"] = listOf("$optimizeSettings") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/templates".replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Update build feature parameter for the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param parameterName  
    * @param body  (optional)
    * @return String
    */
    fun addParameterToBuildFeature(
                    btLocator: String,
                    featureId: String,
                    parameterName: String,
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
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId").replace("{"+"parameterName"+"}", "$parameterName"),
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
    * Add a parameter to a build step of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param parameterName  
    * @param body  (optional)
    * @return String
    */
    fun addParameterToBuildStep(
                    btLocator: String,
                    stepId: String,
                    parameterName: String,
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
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId").replace("{"+"parameterName"+"}", "$parameterName"),
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
    * Add a snapshot dependency to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return SnapshotDependency
    */
    fun addSnapshotDependencyToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: SnapshotDependency? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : SnapshotDependency {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<SnapshotDependency>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a trigger to the matching build configuration.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/triggers" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Trigger
    */
    fun addTriggerToBuildType(
                    btLocator: String,
                    fields: String? = null,
                    body: Trigger? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Trigger {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/triggers".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Trigger>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a VCS root to the matching build.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return VcsRootEntry
    */
    fun addVcsRootToBuildType(
                    btLocator: String,
                    body: VcsRootEntry? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootEntry {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootEntry>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create a build parameter.
    * Runs POST request on "/app/rest/buildTypes/{btLocator}/parameters" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Property
    */
    fun createBuildParameterOfBuildType(
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters".replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Create a new build configuration.
    * Runs POST request on "/app/rest/buildTypes" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return BuildType
    */
    fun createBuildType(
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
            RequestMethod.POST,
            "/app/rest/buildTypes",
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
    * Remove an agent requirement of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}" endpoint.
    * @param btLocator  
    * @param agentRequirementLocator  
    * @return Unit
    */
    fun deleteAgentRequirement(
                    btLocator: String,
                    agentRequirementLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"agentRequirementLocator"+"}", "$agentRequirementLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove an artifact dependency from the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}" endpoint.
    * @param btLocator  
    * @param artifactDepLocator  
    * @return Unit
    */
    fun deleteArtifactDependency(
                    btLocator: String,
                    artifactDepLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"artifactDepLocator"+"}", "$artifactDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete build parameter.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param btLocator  
    * @return Unit
    */
    fun deleteBuildParameterOfBuildType(
                    name: String,
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/parameters" endpoint.
    * @param btLocator  
    * @return Unit
    */
    fun deleteBuildParametersOfBuildType(
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/parameters".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a build step of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @return Unit
    */
    fun deleteBuildStep(
                    btLocator: String,
                    stepId: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update a parameter of a build step of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun deleteBuildStepParameters(
                    btLocator: String,
                    stepId: String,
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
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId"),
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
    * Delete build configuration matching the locator.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}" endpoint.
    * @param btLocator  
    * @return Unit
    */
    fun deleteBuildType(
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a build feature of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/features/{featureId}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @return Unit
    */
    fun deleteFeatureOfBuildType(
                    btLocator: String,
                    featureId: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a snapshot dependency of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}" endpoint.
    * @param btLocator  
    * @param snapshotDepLocator  
    * @return Unit
    */
    fun deleteSnapshotDependency(
                    btLocator: String,
                    snapshotDepLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"snapshotDepLocator"+"}", "$snapshotDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a trigger of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}" endpoint.
    * @param btLocator  
    * @param triggerLocator  
    * @return Unit
    */
    fun deleteTrigger(
                    btLocator: String,
                    triggerLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"triggerLocator"+"}", "$triggerLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a VCS root of the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}" endpoint.
    * @param btLocator  
    * @param vcsRootLocator  
    * @return Unit
    */
    fun deleteVcsRootOfBuildType(
                    btLocator: String,
                    vcsRootLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Download specific file.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs/files/latest/files{path}" endpoint.
    * @param path  
    * @param btLocator  
    * @param resolveParameters  (optional)
    * @return Unit
    */
    fun downloadFileOfBuildType(
                    path: String,
                    btLocator: String,
                    resolveParameters: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs/files/latest/files{path}".replace("{"+"path"+"}", "$path").replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get an agent requirement of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}" endpoint.
    * @param btLocator  
    * @param agentRequirementLocator  
    * @param fields  (optional)
    * @return AgentRequirement
    */
    fun getAgentRequirement(
                    btLocator: String,
                    agentRequirementLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentRequirement {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"agentRequirementLocator"+"}", "$agentRequirementLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentRequirement>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a setting of an agent requirement of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param agentRequirementLocator  
    * @param fieldName  
    * @return String
    */
    fun getAgentRequirementParameter(
                    btLocator: String,
                    agentRequirementLocator: String,
                    fieldName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"agentRequirementLocator"+"}", "$agentRequirementLocator").replace("{"+"fieldName"+"}", "$fieldName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get external IDs of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/aliases" endpoint.
    * @param btLocator  
    * @param field  (optional)
    * @return Items
    */
    fun getAliases(
                    btLocator: String,
                    field: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Items {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        field?.let { localQuery["field"] = listOf("$field") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/aliases".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Items>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all agent requirements of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/agent-requirements" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return AgentRequirements
    */
    fun getAllAgentRequirements(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentRequirements {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/agent-requirements".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentRequirements>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all artifact dependencies of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return ArtifactDependencies
    */
    fun getAllArtifactDependencies(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ArtifactDependencies {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ArtifactDependencies>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all branches of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/branches" endpoint.
    * @param btLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Branches
    */
    fun getAllBranchesOfBuildType(
                    btLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Branches {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/branches".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Branches>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all parameters of a build feature of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param fields  (optional)
    * @return Properties
    */
    fun getAllBuildFeatureParameters(
                    btLocator: String,
                    featureId: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all build features of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/features" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return Features
    */
    fun getAllBuildFeatures(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Features {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/features".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Features>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all parameters of a build step of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param fields  (optional)
    * @return Properties
    */
    fun getAllBuildStepParameters(
                    btLocator: String,
                    stepId: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all build steps of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/steps" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return Steps
    */
    fun getAllBuildSteps(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Steps {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/steps".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Steps>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all build templates of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/templates" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun getAllBuildTemplates(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/templates".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all build configurations.
    * Runs GET request on "/app/rest/buildTypes" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun getAllBuildTypes(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all investigations of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/investigations" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return Investigations
    */
    fun getAllInvestigationsOfBuildType(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Investigations {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/investigations".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Investigations>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all snapshot dependencies of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return SnapshotDependencies
    */
    fun getAllSnapshotDependencies(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : SnapshotDependencies {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<SnapshotDependencies>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all triggers of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/triggers" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return Triggers
    */
    fun getAllTriggers(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Triggers {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/triggers".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Triggers>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all VCS roots of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return VcsRootEntries
    */
    fun getAllVcsRootsOfBuildType(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootEntries {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootEntries>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get an artifact dependency of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}" endpoint.
    * @param btLocator  
    * @param artifactDepLocator  
    * @param fields  (optional)
    * @return ArtifactDependency
    */
    fun getArtifactDependency(
                    btLocator: String,
                    artifactDepLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ArtifactDependency {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"artifactDepLocator"+"}", "$artifactDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ArtifactDependency>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a parameter of an artifact dependency of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param artifactDepLocator  
    * @param fieldName  
    * @return String
    */
    fun getArtifactDependencyParameter(
                    btLocator: String,
                    artifactDepLocator: String,
                    fieldName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"artifactDepLocator"+"}", "$artifactDepLocator").replace("{"+"fieldName"+"}", "$fieldName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a build feature of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/features/{featureId}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param fields  (optional)
    * @return Feature
    */
    fun getBuildFeature(
                    btLocator: String,
                    featureId: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Feature {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Feature>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a parameter of a build feature of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param parameterName  
    * @return String
    */
    fun getBuildFeatureParameter(
                    btLocator: String,
                    featureId: String,
                    parameterName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId").replace("{"+"parameterName"+"}", "$parameterName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the setting of a build feature of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/{name}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param name  
    * @return String
    */
    fun getBuildFeatureSetting(
                    btLocator: String,
                    featureId: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/{name}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build parameter.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param btLocator  
    * @param fields  (optional)
    * @return Property
    */
    fun getBuildParameterOfBuildType(
                    name: String,
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Property {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue" endpoint.
    * @param name  
    * @param btLocator  
    * @return String
    */
    fun getBuildParameterSpecificationOfBuildType(
                    name: String,
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/type" endpoint.
    * @param name  
    * @param btLocator  
    * @return Type
    */
    fun getBuildParameterTypeOfBuildType(
                    name: String,
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Type {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/type".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/value" endpoint.
    * @param name  
    * @param btLocator  
    * @return String
    */
    fun getBuildParameterValueOfBuildType(
                    name: String,
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/value".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/parameters" endpoint.
    * @param btLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun getBuildParametersOfBuildType(
                    btLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/parameters".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a build step of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param fields  (optional)
    * @return Step
    */
    fun getBuildStep(
                    btLocator: String,
                    stepId: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Step {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Step>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a parameter of a build step of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param parameterName  
    * @return String
    */
    fun getBuildStepParameter(
                    btLocator: String,
                    stepId: String,
                    parameterName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId").replace("{"+"parameterName"+"}", "$parameterName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the setting of a build step of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param fieldName  
    * @return String
    */
    fun getBuildStepSetting(
                    btLocator: String,
                    stepId: String,
                    fieldName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId").replace("{"+"fieldName"+"}", "$fieldName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a template of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/templates/{templateLocator}" endpoint.
    * @param btLocator  
    * @param templateLocator  
    * @param fields  (optional)
    * @return BuildType
    */
    fun getBuildTemplate(
                    btLocator: String,
                    templateLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/templates/{templateLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"templateLocator"+"}", "$templateLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build configuration matching the locator.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return BuildType
    */
    fun getBuildType(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildType {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildType>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get tags of builds of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/buildTags" endpoint.
    * @param btLocator  
    * @param field  (optional)
    * @return Tags
    */
    fun getBuildTypeBuildTags(
                    btLocator: String,
                    field: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tags {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        field?.let { localQuery["field"] = listOf("$field") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/buildTags".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tags>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get builds of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/builds" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return Builds
    */
    fun getBuildTypeBuilds(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/builds".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/{field}" endpoint.
    * @param btLocator  
    * @param field  
    * @return String
    */
    fun getBuildTypeField(
                    btLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/{field}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the settings file of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/settingsFile" endpoint.
    * @param btLocator  
    * @return String
    */
    fun getBuildTypeSettingsFile(
                    btLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/settingsFile".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get metadata of specific file.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path}" endpoint.
    * @param path  
    * @param btLocator  
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @return File
    */
    fun getFileMetadataOfBuildType(
                    path: String,
                    btLocator: String,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : File {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path}".replace("{"+"path"+"}", "$path").replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<File>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List files under this path.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs/files/latest/{path}" endpoint.
    * @param path  
    * @param btLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @return Files
    */
    fun getFilesListForSubpathOfBuildType(
                    path: String,
                    btLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs/files/latest/{path}".replace("{"+"path"+"}", "$path").replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List all files.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs/files/latest" endpoint.
    * @param btLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @return Files
    */
    fun getFilesListOfBuildType(
                    btLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs/files/latest".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a snapshot dependency of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}" endpoint.
    * @param btLocator  
    * @param snapshotDepLocator  
    * @param fields  (optional)
    * @return SnapshotDependency
    */
    fun getSnapshotDependency(
                    btLocator: String,
                    snapshotDepLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : SnapshotDependency {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"snapshotDepLocator"+"}", "$snapshotDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<SnapshotDependency>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a trigger of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}" endpoint.
    * @param btLocator  
    * @param triggerLocator  
    * @param fields  (optional)
    * @return Trigger
    */
    fun getTrigger(
                    btLocator: String,
                    triggerLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Trigger {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"triggerLocator"+"}", "$triggerLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Trigger>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a parameter of a trigger of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param triggerLocator  
    * @param fieldName  
    * @return String
    */
    fun getTriggerParameter(
                    btLocator: String,
                    triggerLocator: String,
                    fieldName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"triggerLocator"+"}", "$triggerLocator").replace("{"+"fieldName"+"}", "$fieldName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a VCS root of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}" endpoint.
    * @param btLocator  
    * @param vcsRootLocator  
    * @param fields  (optional)
    * @return VcsRootEntry
    */
    fun getVcsRoot(
                    btLocator: String,
                    vcsRootLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootEntry {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootEntry>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get checkout rules of a VCS root of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules" endpoint.
    * @param btLocator  
    * @param vcsRootLocator  
    * @return String
    */
    fun getVcsRootCheckoutRules(
                    btLocator: String,
                    vcsRootLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all VCS root instances of the matching build configuration.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcsRootInstances" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @return VcsRootInstances
    */
    fun getVcsRootInstancesOfBuildType(
                    btLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstances {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcsRootInstances".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstances>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get specific file zipped.
    * Runs GET request on "/app/rest/buildTypes/{btLocator}/vcs/files/latest/archived{path}" endpoint.
    * @param path  
    * @param btLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param name  (optional)
    * @param resolveParameters  (optional)
    * @return Unit
    */
    fun getZippedFileOfBuildType(
                    path: String,
                    btLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    name: String? = null,
                    resolveParameters: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        name?.let { localQuery["name"] = listOf("$name") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/buildTypes/{btLocator}/vcs/files/latest/archived{path}".replace("{"+"path"+"}", "$path").replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Detach all templates from the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/templates" endpoint.
    * @param btLocator  
    * @param inlineSettings  (optional)
    * @return Unit
    */
    fun removeAllTemplates(
                    btLocator: String,
                    inlineSettings: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        inlineSettings?.let { localQuery["inlineSettings"] = listOf("$inlineSettings") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/templates".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Detach a template from the matching build configuration.
    * Runs DELETE request on "/app/rest/buildTypes/{btLocator}/templates/{templateLocator}" endpoint.
    * @param btLocator  
    * @param templateLocator  
    * @param inlineSettings  (optional)
    * @return Unit
    */
    fun removeTemplate(
                    btLocator: String,
                    templateLocator: String,
                    inlineSettings: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        inlineSettings?.let { localQuery["inlineSettings"] = listOf("$inlineSettings") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/buildTypes/{btLocator}/templates/{templateLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"templateLocator"+"}", "$templateLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update an agent requirement of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}" endpoint.
    * @param btLocator  
    * @param agentRequirementLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return AgentRequirement
    */
    fun replaceAgentRequirement(
                    btLocator: String,
                    agentRequirementLocator: String,
                    fields: String? = null,
                    body: AgentRequirement? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentRequirement {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"agentRequirementLocator"+"}", "$agentRequirementLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentRequirement>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all agent requirements of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/agent-requirements" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return AgentRequirements
    */
    fun replaceAllAgentRequirements(
                    btLocator: String,
                    fields: String? = null,
                    body: AgentRequirements? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AgentRequirements {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/agent-requirements".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AgentRequirements>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all artifact dependencies of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return ArtifactDependencies
    */
    fun replaceAllArtifactDependencies(
                    btLocator: String,
                    fields: String? = null,
                    body: ArtifactDependencies? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ArtifactDependencies {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ArtifactDependencies>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all build features of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/features" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Features
    */
    fun replaceAllBuildFeatures(
                    btLocator: String,
                    fields: String? = null,
                    body: Features? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Features {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/features".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Features>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all build steps of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/steps" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Steps
    */
    fun replaceAllBuildSteps(
                    btLocator: String,
                    fields: String? = null,
                    body: Steps? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Steps {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/steps".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Steps>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all snapshot dependencies of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return SnapshotDependencies
    */
    fun replaceAllSnapshotDependencies(
                    btLocator: String,
                    fields: String? = null,
                    body: SnapshotDependencies? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : SnapshotDependencies {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<SnapshotDependencies>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all triggers of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/triggers" endpoint.
    * @param btLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Triggers
    */
    fun replaceAllTriggers(
                    btLocator: String,
                    fields: String? = null,
                    body: Triggers? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Triggers {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/triggers".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Triggers>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update all VCS roots of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return VcsRootEntries
    */
    fun replaceAllVcsRoots(
                    btLocator: String,
                    body: VcsRootEntries? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootEntries {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries".replace("{"+"btLocator"+"}", "$btLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootEntries>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update an artifact dependency of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}" endpoint.
    * @param btLocator  
    * @param artifactDepLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return ArtifactDependency
    */
    fun replaceArtifactDependency(
                    btLocator: String,
                    artifactDepLocator: String,
                    fields: String? = null,
                    body: ArtifactDependency? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ArtifactDependency {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"artifactDepLocator"+"}", "$artifactDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ArtifactDependency>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a build feature of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/features/{featureId}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Feature
    */
    fun replaceBuildFeature(
                    btLocator: String,
                    featureId: String,
                    fields: String? = null,
                    body: Feature? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Feature {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/features/{featureId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Feature>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a parameter of a build feature of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun replaceBuildFeatureParameters(
                    btLocator: String,
                    featureId: String,
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
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId"),
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
    * Replace a build step of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Step
    */
    fun replaceBuildStep(
                    btLocator: String,
                    stepId: String,
                    fields: String? = null,
                    body: Step? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Step {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Step>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a snapshot dependency of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}" endpoint.
    * @param btLocator  
    * @param snapshotDepLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return SnapshotDependency
    */
    fun replaceSnapshotDependency(
                    btLocator: String,
                    snapshotDepLocator: String,
                    fields: String? = null,
                    body: SnapshotDependency? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : SnapshotDependency {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"snapshotDepLocator"+"}", "$snapshotDepLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<SnapshotDependency>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a trigger of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}" endpoint.
    * @param btLocator  
    * @param triggerLocator  
    * @param fields  (optional)
    * @param body  (optional)
    * @return Trigger
    */
    fun replaceTrigger(
                    btLocator: String,
                    triggerLocator: String,
                    fields: String? = null,
                    body: Trigger? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Trigger {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"triggerLocator"+"}", "$triggerLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Trigger>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a parameter of an agent requirement of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param agentRequirementLocator  
    * @param fieldName  
    * @param body  (optional)
    * @return String
    */
    fun setAgentRequirementParameter(
                    btLocator: String,
                    agentRequirementLocator: String,
                    fieldName: String,
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
            "/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"agentRequirementLocator"+"}", "$agentRequirementLocator").replace("{"+"fieldName"+"}", "$fieldName"),
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
    * Update a parameter of an artifact dependency of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param artifactDepLocator  
    * @param fieldName  
    * @param body  (optional)
    * @return String
    */
    fun setArtifactDependencyParameter(
                    btLocator: String,
                    artifactDepLocator: String,
                    fieldName: String,
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
            "/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"artifactDepLocator"+"}", "$artifactDepLocator").replace("{"+"fieldName"+"}", "$fieldName"),
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
    * Update a parameter of a build feature of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/features/{featureId}/{name}" endpoint.
    * @param btLocator  
    * @param featureId  
    * @param name  
    * @param body  (optional)
    * @return String
    */
    fun setBuildFeatureParameter(
                    btLocator: String,
                    featureId: String,
                    name: String,
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
            "/app/rest/buildTypes/{btLocator}/features/{featureId}/{name}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"featureId"+"}", "$featureId").replace("{"+"name"+"}", "$name"),
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
    * Update a parameter of a build step of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}" endpoint.
    * @param btLocator  
    * @param stepId  
    * @param fieldName  
    * @param body  (optional)
    * @return String
    */
    fun setBuildStepParameter(
                    btLocator: String,
                    stepId: String,
                    fieldName: String,
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
            "/app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"stepId"+"}", "$stepId").replace("{"+"fieldName"+"}", "$fieldName"),
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
    * Update a field of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/{field}" endpoint.
    * @param btLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setBuildTypeField(
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/{field}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"field"+"}", "$field"),
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
    * Update all templates of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/templates" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param optimizeSettings  (optional)
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun setBuildTypeTemplates(
                    btLocator: String,
                    body: BuildTypes? = null,
                    optimizeSettings: Boolean? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        optimizeSettings?.let { localQuery["optimizeSettings"] = listOf("$optimizeSettings") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/templates".replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Update a parameter of a trigger of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}" endpoint.
    * @param btLocator  
    * @param triggerLocator  
    * @param fieldName  
    * @param body  (optional)
    * @return String
    */
    fun setTriggerParameter(
                    btLocator: String,
                    triggerLocator: String,
                    fieldName: String,
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
            "/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"triggerLocator"+"}", "$triggerLocator").replace("{"+"fieldName"+"}", "$fieldName"),
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
    * Update build parameter.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/parameters/{name}" endpoint.
    * @param name  
    * @param btLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Property
    */
    fun updateBuildParameterOfBuildType(
                    name: String,
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters/{name}".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue" endpoint.
    * @param name  
    * @param btLocator  
    * @param body  (optional)
    * @return String
    */
    fun updateBuildParameterSpecificationOfBuildType(
                    name: String,
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/type/rawValue".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/type" endpoint.
    * @param name  
    * @param btLocator  
    * @param body  (optional)
    * @return Type
    */
    fun updateBuildParameterTypeOfBuildType(
                    name: String,
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/type".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/parameters/{name}/value" endpoint.
    * @param name  
    * @param btLocator  
    * @param body  (optional)
    * @return String
    */
    fun updateBuildParameterValueOfBuildType(
                    name: String,
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters/{name}/value".replace("{"+"name"+"}", "$name").replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/parameters" endpoint.
    * @param btLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun updateBuildParametersOfBuildType(
                    btLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/parameters".replace("{"+"btLocator"+"}", "$btLocator"),
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
    * Update a VCS root of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}" endpoint.
    * @param btLocator  
    * @param vcsRootLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return VcsRootEntry
    */
    fun updateBuildTypeVcsRoot(
                    btLocator: String,
                    vcsRootLocator: String,
                    body: VcsRootEntry? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootEntry {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootEntry>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update checkout rules of a VCS root of the matching build configuration.
    * Runs PUT request on "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules" endpoint.
    * @param btLocator  
    * @param vcsRootLocator  
    * @param body  (optional)
    * @return String
    */
    fun updateBuildTypeVcsRootCheckoutRules(
                    btLocator: String,
                    vcsRootLocator: String,
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
            "/app/rest/buildTypes/{btLocator}/vcs-root-entries/{vcsRootLocator}/checkout-rules".replace("{"+"btLocator"+"}", "$btLocator").replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
