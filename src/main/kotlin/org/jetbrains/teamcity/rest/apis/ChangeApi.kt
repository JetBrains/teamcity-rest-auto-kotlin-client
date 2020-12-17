package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class ChangeApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all changes.
    * Runs GET request on "/app/rest/changes" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Changes
    */
    fun getAllChanges(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Changes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Changes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get change matching the locator.
    * Runs GET request on "/app/rest/changes/{changeLocator}" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return Change
    */
    fun getChange(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Change {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Change>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get attributes of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/attributes" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return Entries
    */
    fun getChangeAttributes(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Entries {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/attributes".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Entries>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get duplicates of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/duplicates" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return Changes
    */
    fun getChangeDuplicates(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Changes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/duplicates".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Changes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/{field}" endpoint.
    * @param changeLocator  
    * @param field  
    * @return String
    */
    fun getChangeField(
                    changeLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/{field}".replace("{"+"changeLocator"+"}", "$changeLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get first builds of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/firstBuilds" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return Builds
    */
    fun getChangeFirstBuilds(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Builds {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/firstBuilds".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Builds>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get issues of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/issues" endpoint.
    * @param changeLocator  
    * @return Issues
    */
    fun getChangeIssue(
                    changeLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Issues {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/issues".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Issues>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get parent changes of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/parentChanges" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return Changes
    */
    fun getChangeParentChanges(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Changes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/parentChanges".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Changes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get parent revisions of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/parentRevisions" endpoint.
    * @param changeLocator  
    * @return Items
    */
    fun getChangeParentRevisions(
                    changeLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Items {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/parentRevisions".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Items>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get build configurations related to the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/buildTypes" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return BuildTypes
    */
    fun getChangeRelatedBuildTypes(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : BuildTypes {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/buildTypes".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<BuildTypes>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a VCS root instance of the matching change.
    * Runs GET request on "/app/rest/changes/{changeLocator}/vcsRootInstance" endpoint.
    * @param changeLocator  
    * @param fields  (optional)
    * @return VcsRootInstance
    */
    fun getChangeVcsRoot(
                    changeLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : VcsRootInstance {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/changes/{changeLocator}/vcsRootInstance".replace("{"+"changeLocator"+"}", "$changeLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<VcsRootInstance>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
