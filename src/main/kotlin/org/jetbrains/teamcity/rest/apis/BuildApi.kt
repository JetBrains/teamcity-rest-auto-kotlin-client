package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class BuildApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add a VCS label to the matching build.
    * Runs POST request on "/app/rest/builds/{buildLocator}/vcsLabels" endpoint.
    * @param buildLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @param body  (optional)
    * @return VcsLabels
    */
    fun addBuildVcsLabel(
                    buildLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    body: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsLabels {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/builds/{buildLocator}/vcsLabels".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsLabels>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Adds a message to the build log. Service messages are accepted.
    * Runs POST request on "/app/rest/builds/{buildLocator}/log" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Unit
    */
    fun addLogMessageToBuild(
                    buildLocator: String,
                    body: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/builds/{buildLocator}/log".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Add a build problem to the matching build.
    * Runs POST request on "/app/rest/builds/{buildLocator}/problemOccurrences" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return ProblemOccurrence
    */
    fun addProblemToBuild(
                    buildLocator: String,
                    body: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ProblemOccurrence {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/builds/{buildLocator}/problemOccurrences".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ProblemOccurrence>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add tags to the matching build.
    * Runs POST request on "/app/rest/builds/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Tags
    */
    fun addTagsToBuild(
                    buildLocator: String,
                    body: Tags? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tags {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/builds/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tags>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add tags to multiple matching builds.
    * Runs POST request on "/app/rest/builds/multiple/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun addTagsToMultipleBuilds(
                    buildLocator: String,
                    body: Tags? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/builds/multiple/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete build matching the locator.
    * Runs DELETE request on "/app/rest/builds/{buildLocator}" endpoint.
    * @param buildLocator  
    * @return Unit
    */
    fun deleteBuild(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/{buildLocator}".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove the build comment matching the locator.
    * Runs DELETE request on "/app/rest/builds/{buildLocator}/comment" endpoint.
    * @param buildLocator  
    * @return Unit
    */
    fun deleteBuildComment(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/{buildLocator}/comment".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete comments of multiple matching builds.
    * Runs DELETE request on "/app/rest/builds/multiple/{buildLocator}/comment" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun deleteMultipleBuildComments(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/multiple/{buildLocator}/comment".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete multiple builds matching the locator.
    * Runs DELETE request on "/app/rest/builds/multiple/{buildLocator}" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun deleteMultipleBuilds(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/multiple/{buildLocator}".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Download specific file.
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifacts/files{path}" endpoint.
    * @param path  
    * @param buildLocator  
    * @param resolveParameters  (optional)
    * @param logBuildUsage  (optional)
    * @return Unit
    */
    fun downloadFileOfBuild(
                    path: String,
                    buildLocator: String,
                    resolveParameters: Boolean? = null,
                    logBuildUsage: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }
        logBuildUsage?.let { localQuery["logBuildUsage"] = listOf("$logBuildUsage") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifacts/files{path}".replace("{"+"path"+"}", "$path").replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the build status of aggregated matching builds.
    * Runs GET request on "/app/rest/builds/aggregated/{buildLocator}/status" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun getAggregatedBuildStatus(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/aggregated/{buildLocator}/status".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the status icon (in specified format) of aggregated matching builds.
    * Runs GET request on "/app/rest/builds/aggregated/{buildLocator}/statusIcon{suffix}" endpoint.
    * @param buildLocator  
    * @param suffix  
    * @return Unit
    */
    fun getAggregatedBuildStatusIcon(
                    buildLocator: String,
                    suffix: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/aggregated/{buildLocator}/statusIcon{suffix}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"suffix"+"}", "$suffix"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all builds.
    * Runs GET request on "/app/rest/builds" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Builds
    */
    fun getAllBuilds(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get artifact dependency changes of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifactDependencyChanges" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return BuildChanges
    */
    fun getArtifactDependencyChanges(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildChanges {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifactDependencyChanges".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildChanges>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the artifacts' directory of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifactsDirectory" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun getArtifactsDirectory(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifactsDirectory".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build matching the locator.
    * Runs GET request on "/app/rest/builds/{buildLocator}" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return Build
    */
    fun getBuild(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Build>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get actual build parameters of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/resulting-properties" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getBuildActualParameters(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/resulting-properties".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/{field}" endpoint.
    * @param buildLocator  
    * @param field  
    * @return String
    */
    fun getBuildField(
                    buildLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/{field}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the finish date of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/finishDate" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun getBuildFinishDate(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/finishDate".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the number of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/number" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun getBuildNumber(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/number".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Check if the matching build is pinned.
    * Runs GET request on "/app/rest/builds/{buildLocator}/pinInfo" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return PinInfo
    */
    fun getBuildPinInfo(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : PinInfo {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/pinInfo".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<PinInfo>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build problems of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/problemOccurrences" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return ProblemOccurrences
    */
    fun getBuildProblems(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : ProblemOccurrences {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/problemOccurrences".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<ProblemOccurrences>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get related issues of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/relatedIssues" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return IssuesUsages
    */
    fun getBuildRelatedIssues(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : IssuesUsages {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/relatedIssues".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<IssuesUsages>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the resolvement status of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/resolved/{value}" endpoint.
    * @param buildLocator  
    * @param value  
    * @return String
    */
    fun getBuildResolved(
                    buildLocator: String,
                    value: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/resolved/{value}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"value"+"}", "$value"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update a build parameter of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/resulting-properties/{propertyName}" endpoint.
    * @param buildLocator  
    * @param propertyName  
    * @return String
    */
    fun getBuildResultingProperties(
                    buildLocator: String,
                    propertyName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/resulting-properties/{propertyName}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"propertyName"+"}", "$propertyName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a source file of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/sources/files/{fileName}" endpoint.
    * @param buildLocator  
    * @param fileName  
    * @return Unit
    */
    fun getBuildSourceFile(
                    buildLocator: String,
                    fileName: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/sources/files/{fileName}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"fileName"+"}", "$fileName"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a statistical value of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/statistics/{name}" endpoint.
    * @param buildLocator  
    * @param name  
    * @return String
    */
    fun getBuildStatisticValue(
                    buildLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/statistics/{name}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all statistical values of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/statistics" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getBuildStatisticValues(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/statistics".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the status icon (in specified format) of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/statusIcon{suffix}" endpoint.
    * @param buildLocator  
    * @param suffix  
    * @return Unit
    */
    fun getBuildStatusIcon(
                    buildLocator: String,
                    suffix: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/statusIcon{suffix}".replace("{"+"buildLocator"+"}", "$buildLocator").replace("{"+"suffix"+"}", "$suffix"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the build status text of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/statusText" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun getBuildStatusText(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/statusText".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get tags of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Tags
    */
    fun getBuildTags(
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
            "/app/rest/builds/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tags>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get test occurrences of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/testOccurrences" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return TestOccurrences
    */
    fun getBuildTestOccurrences(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : TestOccurrences {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/testOccurrences".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<TestOccurrences>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get VCS labels of the matching build.
    * Runs GET request on "/app/rest/builds/{buildLocator}/vcsLabels" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return VcsLabels
    */
    fun getBuildVcsLabels(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsLabels {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/vcsLabels".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsLabels>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Check if the matching build is canceled.
    * Runs GET request on "/app/rest/builds/{buildLocator}/canceledInfo" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return Comment
    */
    fun getCanceledInfo(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Comment {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/canceledInfo".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Comment>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get metadata of specific file.
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifacts/metadata{path}" endpoint.
    * @param path  
    * @param buildLocator  
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @param logBuildUsage  (optional)
    * @return File
    */
    fun getFileMetadataOfBuild(
                    path: String,
                    buildLocator: String,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    logBuildUsage: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : File {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }
        logBuildUsage?.let { localQuery["logBuildUsage"] = listOf("$logBuildUsage") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifacts/metadata{path}".replace("{"+"path"+"}", "$path").replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifacts/{path}" endpoint.
    * @param path  
    * @param buildLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @param logBuildUsage  (optional)
    * @return Files
    */
    fun getFilesListForSubpathOfBuild(
                    path: String,
                    buildLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    logBuildUsage: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }
        logBuildUsage?.let { localQuery["logBuildUsage"] = listOf("$logBuildUsage") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifacts/{path}".replace("{"+"path"+"}", "$path").replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifacts" endpoint.
    * @param buildLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @param resolveParameters  (optional)
    * @param logBuildUsage  (optional)
    * @return Files
    */
    fun getFilesListOfBuild(
                    buildLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    resolveParameters: Boolean? = null,
                    logBuildUsage: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }
        logBuildUsage?.let { localQuery["logBuildUsage"] = listOf("$logBuildUsage") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifacts".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get multiple builds matching the locator.
    * Runs GET request on "/app/rest/builds/multiple/{buildLocator}" endpoint.
    * @param buildLocator  
    * @param fields  (optional)
    * @return Builds
    */
    fun getMultipleBuilds(
                    buildLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/multiple/{buildLocator}".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get specific file zipped.
    * Runs GET request on "/app/rest/builds/{buildLocator}/artifacts/archived{path}" endpoint.
    * @param path  
    * @param buildLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param name  (optional)
    * @param resolveParameters  (optional)
    * @param logBuildUsage  (optional)
    * @return Unit
    */
    fun getZippedFileOfBuild(
                    path: String,
                    buildLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    name: String? = null,
                    resolveParameters: Boolean? = null,
                    logBuildUsage: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        name?.let { localQuery["name"] = listOf("$name") }
        resolveParameters?.let { localQuery["resolveParameters"] = listOf("$resolveParameters") }
        logBuildUsage?.let { localQuery["logBuildUsage"] = listOf("$logBuildUsage") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/builds/{buildLocator}/artifacts/archived{path}".replace("{"+"path"+"}", "$path").replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Starts the queued build as an agent-less build and returns the corresponding running build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/runningData" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Build
    */
    fun markBuildAsRunning(
                    buildLocator: String,
                    body: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Build {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/{buildLocator}/runningData".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Pin multiple matching builds.
    * Runs PUT request on "/app/rest/builds/multiple/{buildLocator}/pinInfo" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun pinMultipleBuilds(
                    buildLocator: String,
                    body: PinInfo? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/multiple/{buildLocator}/pinInfo".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Remove tags from multiple matching builds.
    * Runs DELETE request on "/app/rest/builds/multiple/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun removeMultipleBuildTags(
                    buildLocator: String,
                    body: Tags? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/multiple/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Remove build parameters from the matching build.
    * Runs DELETE request on "/app/rest/builds/{buildLocator}/caches/finishProperties" endpoint.
    * @param buildLocator  
    * @return Unit
    */
    fun resetBuildFinishProperties(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/builds/{buildLocator}/caches/finishProperties".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update the comment on the matching build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/comment" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @return Unit
    */
    fun setBuildComment(
                    buildLocator: String,
                    body: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/{buildLocator}/comment".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Marks the running build as finished by passing agent the current time of the build to finish.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/finishDate" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @return String
    */
    fun setBuildFinishDate(
                    buildLocator: String,
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
            "/app/rest/builds/{buildLocator}/finishDate".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Update the number of the matching build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/number" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @return String
    */
    fun setBuildNumber(
                    buildLocator: String,
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
            "/app/rest/builds/{buildLocator}/number".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Update the pin info of the matching build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/pinInfo" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return PinInfo
    */
    fun setBuildPinInfo(
                    buildLocator: String,
                    body: PinInfo? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : PinInfo {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/{buildLocator}/pinInfo".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<PinInfo>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update the build status of the matching build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/statusText" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @return String
    */
    fun setBuildStatusText(
                    buildLocator: String,
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
            "/app/rest/builds/{buildLocator}/statusText".replace("{"+"buildLocator"+"}", "$buildLocator"),
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
    * Update tags of the matching build.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/tags" endpoint.
    * @param buildLocator  
    * @param locator  (optional)
    * @param body  (optional)
    * @param fields  (optional)
    * @return Tags
    */
    fun setBuildTags(
                    buildLocator: String,
                    locator: String? = null,
                    body: Tags? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tags {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/{buildLocator}/tags".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tags>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Marks the running build as finished by passing agent the current time of the build to finish.
    * Runs PUT request on "/app/rest/builds/{buildLocator}/finish" endpoint.
    * @param buildLocator  
    * @return String
    */
    fun setFinishedTime(
                    buildLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/{buildLocator}/finish".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update comments in multiple matching builds.
    * Runs PUT request on "/app/rest/builds/multiple/{buildLocator}/comment" endpoint.
    * @param buildLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return MultipleOperationResult
    */
    fun setMultipleBuildComments(
                    buildLocator: String,
                    body: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : MultipleOperationResult {

        var localBody = ""
        if (body != null) {
            localBody = body.toString()
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/builds/multiple/{buildLocator}/comment".replace("{"+"buildLocator"+"}", "$buildLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<MultipleOperationResult>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
