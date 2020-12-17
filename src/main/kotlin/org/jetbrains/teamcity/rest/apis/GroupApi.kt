package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class GroupApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add a new user group.
    * Runs POST request on "/app/rest/userGroups" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return Group
    */
    fun addGroup(
                    body: Group? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Group {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/userGroups",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Group>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Add a role with the specific scope to the matching user group.
    * Runs POST request on "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}" endpoint.
    * @param groupLocator  
    * @param roleId  
    * @param scope  
    * @return Role
    */
    fun addRoleAtScopeToGroup(
                    groupLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Role {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Role>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Add a role to the matching user group.
    * Runs POST request on "/app/rest/userGroups/{groupLocator}/roles" endpoint.
    * @param groupLocator  
    * @param body  (optional)
    * @return Role
    */
    fun addRoleToGroup(
                    groupLocator: String,
                    body: Role? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Role {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/userGroups/{groupLocator}/roles".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Role>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete user group matching the locator.
    * Runs DELETE request on "/app/rest/userGroups/{groupLocator}" endpoint.
    * @param groupLocator  
    * @return Unit
    */
    fun deleteGroup(
                    groupLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/userGroups/{groupLocator}".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all user groups.
    * Runs GET request on "/app/rest/userGroups" endpoint.
    * @param fields  (optional)
    * @return Groups
    */
    fun getAllGroups(
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Groups {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Groups>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get parent groups of the matching user group.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}/parent-groups" endpoint.
    * @param groupLocator  
    * @param fields  (optional)
    * @return Groups
    */
    fun getGroupParentGroups(
                    groupLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Groups {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}/parent-groups".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Groups>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get properties of the matching user group.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}/properties" endpoint.
    * @param groupLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getGroupProperties(
                    groupLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}/properties".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a property of the matching user group.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}/properties/{name}" endpoint.
    * @param groupLocator  
    * @param name  
    * @return String
    */
    fun getGroupProperty(
                    groupLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}/properties/{name}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a role with the specific scope of the matching user group.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}" endpoint.
    * @param groupLocator  
    * @param roleId  
    * @param scope  
    * @return Role
    */
    fun getGroupRoleAtScope(
                    groupLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Role {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Role>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all roles of the matching user group.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}/roles" endpoint.
    * @param groupLocator  
    * @return Roles
    */
    fun getGroupRoles(
                    groupLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Roles {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}/roles".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Roles>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get user group matching the locator.
    * Runs GET request on "/app/rest/userGroups/{groupLocator}" endpoint.
    * @param groupLocator  
    * @param fields  (optional)
    * @return Group
    */
    fun getUserGroupOfGroup(
                    groupLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Group {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/userGroups/{groupLocator}".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Group>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a property of the matching user group.
    * Runs DELETE request on "/app/rest/userGroups/{groupLocator}/properties/{name}" endpoint.
    * @param groupLocator  
    * @param name  
    * @return Unit
    */
    fun removeGroupProperty(
                    groupLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/userGroups/{groupLocator}/properties/{name}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a role with the specific scope from the matching user group.
    * Runs DELETE request on "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}" endpoint.
    * @param groupLocator  
    * @param roleId  
    * @param scope  
    * @return Unit
    */
    fun removeRoleAtScopeFromGroup(
                    groupLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update parent groups of the matching user group.
    * Runs PUT request on "/app/rest/userGroups/{groupLocator}/parent-groups" endpoint.
    * @param groupLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Groups
    */
    fun setGroupParentGroups(
                    groupLocator: String,
                    body: Groups? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Groups {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/userGroups/{groupLocator}/parent-groups".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Groups>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a property of the matching user group.
    * Runs PUT request on "/app/rest/userGroups/{groupLocator}/properties/{name}" endpoint.
    * @param groupLocator  
    * @param name  
    * @param body  (optional)
    * @return String
    */
    fun setGroupProperty(
                    groupLocator: String,
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
            "/app/rest/userGroups/{groupLocator}/properties/{name}".replace("{"+"groupLocator"+"}", "$groupLocator").replace("{"+"name"+"}", "$name"),
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
    * Update roles of the matching user group.
    * Runs PUT request on "/app/rest/userGroups/{groupLocator}/roles" endpoint.
    * @param groupLocator  
    * @param body  (optional)
    * @return Roles
    */
    fun setGroupRoles(
                    groupLocator: String,
                    body: Roles? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Roles {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/userGroups/{groupLocator}/roles".replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Roles>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

}
