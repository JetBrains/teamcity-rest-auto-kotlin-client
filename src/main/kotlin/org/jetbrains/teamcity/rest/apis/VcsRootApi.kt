package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class VcsRootApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add a new VCS root.
    * Runs POST request on "/app/rest/vcs-roots" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return VcsRoot
    */
    fun addVcsRoot(
                    body: VcsRoot? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRoot {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/vcs-roots",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRoot>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete all properties of the matching VCS root.
    * Runs DELETE request on "/app/rest/vcs-roots/{vcsRootLocator}/properties" endpoint.
    * @param vcsRootLocator  
    * @return Unit
    */
    fun deleteAllVcsRootProperties(
                    vcsRootLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/vcs-roots/{vcsRootLocator}/properties".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove VCS root matching the locator.
    * Runs DELETE request on "/app/rest/vcs-roots/{vcsRootLocator}" endpoint.
    * @param vcsRootLocator  
    * @return Unit
    */
    fun deleteVcsRoot(
                    vcsRootLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/vcs-roots/{vcsRootLocator}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Delete a property of the matching VCS root.
    * Runs DELETE request on "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}" endpoint.
    * @param vcsRootLocator  
    * @param name  
    * @return Unit
    */
    fun deleteVcsRootProperty(
                    vcsRootLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all properties of the matching VCS root.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}/properties" endpoint.
    * @param vcsRootLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getAllVcsRootProperties(
                    vcsRootLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}/properties".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all VCS roots.
    * Runs GET request on "/app/rest/vcs-roots" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return VcsRoots
    */
    fun getAllVcsRoots(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRoots {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRoots>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get root endpoints.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}" endpoint.
    * @param vcsRootLocator  
    * @param fields  (optional)
    * @return VcsRoot
    */
    fun getRootEndpoints(
                    vcsRootLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRoot {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRoot>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching VCS root.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}/{field}" endpoint.
    * @param vcsRootLocator  
    * @param field  
    * @return String
    */
    fun getVcsRootField(
                    vcsRootLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}/{field}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all VCS root instances of the matching VCS root.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}/instances" endpoint.
    * @param vcsRootLocator  
    * @param fields  (optional)
    * @return VcsRootInstances
    */
    fun getVcsRootInstances(
                    vcsRootLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstances {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}/instances".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstances>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a property on the matching VCS root.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}" endpoint.
    * @param vcsRootLocator  
    * @param name  
    * @return String
    */
    fun getVcsRootProperty(
                    vcsRootLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get the settings file of the matching VCS root.
    * Runs GET request on "/app/rest/vcs-roots/{vcsRootLocator}/settingsFile" endpoint.
    * @param vcsRootLocator  
    * @return String
    */
    fun getVcsRootSettingsFile(
                    vcsRootLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/vcs-roots/{vcsRootLocator}/settingsFile".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update a field of the matching VCS root.
    * Runs PUT request on "/app/rest/vcs-roots/{vcsRootLocator}/{field}" endpoint.
    * @param vcsRootLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setVcsRootField(
                    vcsRootLocator: String,
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
            "/app/rest/vcs-roots/{vcsRootLocator}/{field}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator").replace("{"+"field"+"}", "$field"),
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
    * Update all properties of the matching VCS root.
    * Runs PUT request on "/app/rest/vcs-roots/{vcsRootLocator}/properties" endpoint.
    * @param vcsRootLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Properties
    */
    fun setVcsRootProperties(
                    vcsRootLocator: String,
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
            "/app/rest/vcs-roots/{vcsRootLocator}/properties".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator"),
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
    * Update a property of the matching VCS root.
    * Runs PUT request on "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}" endpoint.
    * @param vcsRootLocator  
    * @param name  
    * @param body  (optional)
    * @return String
    */
    fun setVcsRootProperty(
                    vcsRootLocator: String,
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
            "/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}".replace("{"+"vcsRootLocator"+"}", "$vcsRootLocator").replace("{"+"name"+"}", "$name"),
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
