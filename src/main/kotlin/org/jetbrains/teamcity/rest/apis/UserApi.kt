package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class UserApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Add a role to the matching user.
    * Runs POST request on "/app/rest/users/{userLocator}/roles" endpoint.
    * @param userLocator  
    * @param body  (optional)
    * @return Role
    */
    fun addRoleToUser(
                    userLocator: String,
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
            "/app/rest/users/{userLocator}/roles".replace("{"+"userLocator"+"}", "$userLocator"),
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
    * Add a role with the specific scope to the matching user.
    * Runs PUT request on "/app/rest/users/{userLocator}/roles/{roleId}/{scope}" endpoint.
    * @param userLocator  
    * @param roleId  
    * @param scope  
    * @return Role
    */
    fun addRoleToUserAtScope(
                    userLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Role {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/users/{userLocator}/roles/{roleId}/{scope}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Role>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Create a new user.
    * Runs POST request on "/app/rest/users" endpoint.
    * @param body  (optional)
    * @param fields  (optional)
    * @return User
    */
    fun addUser(
                    body: User? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : User {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/users",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<User>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Create a new authentication token for the matching user.
    * Runs POST request on "/app/rest/users/{userLocator}/tokens" endpoint.
    * @param userLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Token
    */
    fun addUserToken(
                    userLocator: String,
                    body: Token? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Token {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/app/rest/users/{userLocator}/tokens".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Token>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Delete user matching the locator.
    * Runs DELETE request on "/app/rest/users/{userLocator}" endpoint.
    * @param userLocator  
    * @return Unit
    */
    fun deleteUser(
                    userLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a property of the matching user.
    * Runs DELETE request on "/app/rest/users/{userLocator}/{field}" endpoint.
    * @param userLocator  
    * @param field  
    * @return Unit
    */
    fun deleteUserField(
                    userLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/{field}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove an authentication token from the matching user.
    * Runs DELETE request on "/app/rest/users/{userLocator}/tokens/{name}" endpoint.
    * @param userLocator  
    * @param name  
    * @return Unit
    */
    fun deleteUserToken(
                    userLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/tokens/{name}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a field of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/{field}" endpoint.
    * @param userLocator  
    * @param field  
    * @return String
    */
    fun gerUserField(
                    userLocator: String,
                    field: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/{field}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"field"+"}", "$field"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all groups of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/groups" endpoint.
    * @param userLocator  
    * @param fields  (optional)
    * @return Groups
    */
    fun getAllUserGroups(
                    userLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Groups {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/groups".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Groups>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all user roles of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/roles" endpoint.
    * @param userLocator  
    * @return Roles
    */
    fun getAllUserRoles(
                    userLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Roles {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/roles".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Roles>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all users.
    * Runs GET request on "/app/rest/users" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return Users
    */
    fun getAllUsers(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Users {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Users>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get user matching the locator.
    * Runs GET request on "/app/rest/users/{userLocator}" endpoint.
    * @param userLocator  
    * @param fields  (optional)
    * @return User
    */
    fun getUser(
                    userLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : User {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<User>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a user group of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/groups/{groupLocator}" endpoint.
    * @param userLocator  
    * @param groupLocator  
    * @param fields  (optional)
    * @return Group
    */
    fun getUserGroup(
                    userLocator: String,
                    groupLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Group {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/groups/{groupLocator}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Group>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all permissions effective for the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/permissions" endpoint.
    * @param userLocator  
    * @param locator  (optional)
    * @param fields  (optional)
    * @return PermissionAssignments
    */
    fun getUserPermissions(
                    userLocator: String,
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : PermissionAssignments {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/permissions".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<PermissionAssignments>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all properties of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/properties" endpoint.
    * @param userLocator  
    * @param fields  (optional)
    * @return Properties
    */
    fun getUserProperties(
                    userLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Properties {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/properties".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Properties>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a property of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/properties/{name}" endpoint.
    * @param userLocator  
    * @param name  
    * @return String
    */
    fun getUserProperty(
                    userLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : String {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/properties/{name}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<String>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get a user role with the specific scope from the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/roles/{roleId}/{scope}" endpoint.
    * @param userLocator  
    * @param roleId  
    * @param scope  
    * @return Role
    */
    fun getUserRolesAtScope(
                    userLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Role {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/roles/{roleId}/{scope}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Role>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get all authentication tokens of the matching user.
    * Runs GET request on "/app/rest/users/{userLocator}/tokens" endpoint.
    * @param userLocator  
    * @param fields  (optional)
    * @return Tokens
    */
    fun getUserTokens(
                    userLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Tokens {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/users/{userLocator}/tokens".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Tokens>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove the matching user from the specific group.
    * Runs DELETE request on "/app/rest/users/{userLocator}/groups/{groupLocator}" endpoint.
    * @param userLocator  
    * @param groupLocator  
    * @param fields  (optional)
    * @return Unit
    */
    fun removeUserFromGroup(
                    userLocator: String,
                    groupLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/groups/{groupLocator}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"groupLocator"+"}", "$groupLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a property of the matching user.
    * Runs DELETE request on "/app/rest/users/{userLocator}/properties/{name}" endpoint.
    * @param userLocator  
    * @param name  
    * @return Unit
    */
    fun removeUserProperty(
                    userLocator: String,
                    name: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/properties/{name}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"name"+"}", "$name"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove the RememberMe data of the matching user.
    * Runs DELETE request on "/app/rest/users/{userLocator}/debug/rememberMe" endpoint.
    * @param userLocator  
    * @return Unit
    */
    fun removeUserRememberMe(
                    userLocator: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/debug/rememberMe".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Remove a role with the specific scope from the matching user.
    * Runs DELETE request on "/app/rest/users/{userLocator}/roles/{roleId}/{scope}" endpoint.
    * @param userLocator  
    * @param roleId  
    * @param scope  
    * @return Unit
    */
    fun removeUserRoleAtScope(
                    userLocator: String,
                    roleId: String,
                    scope: String,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : Unit {


        val localQuery: MutableMap<String,List<String>> = HashMap()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/app/rest/users/{userLocator}/roles/{roleId}/{scope}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"roleId"+"}", "$roleId").replace("{"+"scope"+"}", "$scope"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<Unit>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Update user matching the locator.
    * Runs PUT request on "/app/rest/users/{userLocator}" endpoint.
    * @param userLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return User
    */
    fun replaceUser(
                    userLocator: String,
                    body: User? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : User {

        var localBody = ""
        if (body != null) {
            val gson = GsonBuilder().create()
            localBody = gson.toJson(body)
        }

        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/app/rest/users/{userLocator}".replace("{"+"userLocator"+"}", "$userLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<User>(
            localVariableConfig,
            localBody
        )
        return processResponse(response)
    }

    /**
    * Update a field of the matching user.
    * Runs PUT request on "/app/rest/users/{userLocator}/{field}" endpoint.
    * @param userLocator  
    * @param field  
    * @param body  (optional)
    * @return String
    */
    fun setUserField(
                    userLocator: String,
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
            "/app/rest/users/{userLocator}/{field}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"field"+"}", "$field"),
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
    * Update groups of the matching user.
    * Runs PUT request on "/app/rest/users/{userLocator}/groups" endpoint.
    * @param userLocator  
    * @param body  (optional)
    * @param fields  (optional)
    * @return Groups
    */
    fun setUserGroups(
                    userLocator: String,
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
            "/app/rest/users/{userLocator}/groups".replace("{"+"userLocator"+"}", "$userLocator"),
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
    * Update a property of the matching user.
    * Runs PUT request on "/app/rest/users/{userLocator}/properties/{name}" endpoint.
    * @param userLocator  
    * @param name  
    * @param body  (optional)
    * @return String
    */
    fun setUserProperty(
                    userLocator: String,
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
            "/app/rest/users/{userLocator}/properties/{name}".replace("{"+"userLocator"+"}", "$userLocator").replace("{"+"name"+"}", "$name"),
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
    * Update user roles of the matching user.
    * Runs PUT request on "/app/rest/users/{userLocator}/roles" endpoint.
    * @param userLocator  
    * @param body  (optional)
    * @return Roles
    */
    fun setUserRoles(
                    userLocator: String,
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
            "/app/rest/users/{userLocator}/roles".replace("{"+"userLocator"+"}", "$userLocator"),
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
