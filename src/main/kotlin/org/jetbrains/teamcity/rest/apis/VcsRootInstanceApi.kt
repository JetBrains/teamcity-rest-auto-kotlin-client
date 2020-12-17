package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class VcsRootInstanceApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Remove a field of the matching VCS root instance.
    * Runs DELETE request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}" endpoint.
    * @param vcsRootInstanceLocator  
    * @param field  
    * @return Unit
    */
    fun deleteVcsRootInstanceField(
                    vcsRootInstanceLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete the last repository state of the matching VCS root instance.
    * Runs DELETE request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState" endpoint.
    * @param vcsRootInstanceLocator  
    * @return Unit
    */
    fun deleteVcsRootInstanceRepositoryState(
                    vcsRootInstanceLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
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
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/files{path}" endpoint.
    * @param path  
    * @param vcsRootInstanceLocator  
    * @return Unit
    */
    fun downloadFile(
                    path: String,
                    vcsRootInstanceLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/files{path}".replace("{"+"path"+"}", "$path").replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all VCS root instances.
    * Runs GET request on "/app/rest/vcs-root-instances" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return VcsRootInstances
    */
    fun getAllVcsRootInstances(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstances {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstances>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get metadata of specific file.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path}" endpoint.
    * @param path  
    * @param vcsRootInstanceLocator  
    * @param fields  (optional)
    * @return File
    */
    fun getFileMetadata(
                    path: String,
                    vcsRootInstanceLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : File {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path}".replace("{"+"path"+"}", "$path").replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<File>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List all files.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest" endpoint.
    * @param vcsRootInstanceLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Files
    */
    fun getFilesList(
                    vcsRootInstanceLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * List files under this path.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/{path}" endpoint.
    * @param path  
    * @param vcsRootInstanceLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Files
    */
    fun getFilesListForSubpath(
                    path: String,
                    vcsRootInstanceLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Files {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/{path}".replace("{"+"path"+"}", "$path").replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Files>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get VCS root instance matching the locator.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}" endpoint.
    * @param vcsRootInstanceLocator  
    * @param fields  (optional)
    * @return VcsRootInstance
    */
    fun getVcsRootInstance(
                    vcsRootInstanceLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstance {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstance>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the creation date of the matching VCS root instance.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate" endpoint.
    * @param vcsRootInstanceLocator  
    * @return String
    */
    fun getVcsRootInstanceCreationDate(
                    vcsRootInstanceLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching VCS root instance.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}" endpoint.
    * @param vcsRootInstanceLocator  
    * @param field  
    * @return String
    */
    fun getVcsRootInstanceField(
                    vcsRootInstanceLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all properties of the matching VCS root instance.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties" endpoint.
    * @param vcsRootInstanceLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getVcsRootInstanceProperties(
                    vcsRootInstanceLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the repository state of the matching VCS root instance.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState" endpoint.
    * @param vcsRootInstanceLocator  
    * @param fields  (optional)
    * @return Entries
    */
    fun getVcsRootInstanceRepositoryState(
                    vcsRootInstanceLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Entries {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Entries>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get specific file zipped.
    * Runs GET request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/archived{path}" endpoint.
    * @param path  
    * @param vcsRootInstanceLocator  
    * @param basePath  (optional)
    * @param locator  (optional)
    * @param name  (optional)
    * @return Unit
    */
    fun getZippedFile(
                    path: String,
                    vcsRootInstanceLocator: String,
                    basePath: String? = null,
                    locator: String? = null,
                    name: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        basePath?.let { localQuery["basePath"] = listOf("$basePath") }
        locator?.let { localQuery["locator"] = listOf("$locator") }
        name?.let { localQuery["name"] = listOf("$name") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/archived{path}".replace("{"+"path"+"}", "$path").replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Check for the pending changes for all VCS root instances.
    * Runs POST request on "/app/rest/vcs-root-instances/checkingForChangesQueue" endpoint.
    * @param locator  (optional)
    * @param requestor  (optional)
    * @param fields  (optional)
    * @return VcsRootInstances
    */
    fun requestPendingChangesCheck(
                    locator: String? = null,
                    requestor: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstances {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        requestor?.let { localQuery["requestor"] = listOf("$requestor") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/vcs-root-instances/checkingForChangesQueue",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstances>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching VCS root instance.
    * Runs PUT request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}" endpoint.
    * @param vcsRootInstanceLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setVcsRootInstanceField(
                    vcsRootInstanceLocator: String,
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
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator").replace("{"+"field"+"}", "$field"),
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
    * Update the repository state of the matching VCS root instance.
    * Runs PUT request on "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState" endpoint.
    * @param vcsRootInstanceLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Entries
    */
    fun setVcsRootInstanceRepositoryState(
                    vcsRootInstanceLocator: String,
                    body: Entries? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Entries {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState".replace("{"+"vcsRootInstanceLocator"+"}", "$vcsRootInstanceLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Entries>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Send the commit hook notification.
    * Runs POST request on "/app/rest/vcs-root-instances/commitHookNotification" endpoint.
    * @param locator  (optional)
    * @param okOnNothingFound  (optional)
    * @return Unit
    */
    fun triggerCommitHookNotification(
                    locator: String? = null,
                    okOnNothingFound: Boolean? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        okOnNothingFound?.let { localQuery["okOnNothingFound"] = listOf("$okOnNothingFound") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/vcs-root-instances/commitHookNotification",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
