/**
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package org.jetbrains.teamcity.rest.models

import com.google.gson.annotations.SerializedName
import org.jetbrains.teamcity.rest.base.*
import org.jetbrains.teamcity.rest.infrastructure.ApiClient
import org.jetbrains.teamcity.rest.infrastructure.RequestConfig
import java.time.LocalDateTime

/**
Represents a list of PermissionAssignment entities.
 * @param count 
 * @param permissionAssignment 
 */
data class PermissionAssignments(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("permissionAssignment") val permissionAssignment: List<PermissionAssignment>? = null
) : ListEntity<PermissionAssignment>() {
    @Transient private val classModelName: String = "permissionAssignments"

    override fun items(): List<PermissionAssignment> {
        if (permissionAssignment == null)
            return emptyList()
        return permissionAssignment
    }


}

