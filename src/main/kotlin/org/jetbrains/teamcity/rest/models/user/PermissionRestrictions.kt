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
Represents a list of PermissionRestriction entities.
 * @param count 
 * @param permissionRestriction 
 */
data class PermissionRestrictions(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("permissionRestriction") val permissionRestriction: List<PermissionRestriction>? = null
) : ListEntity<PermissionRestriction>() {
    @Transient private val classModelName: String = "permissionRestrictions"

    override fun items(): List<PermissionRestriction> {
        if (permissionRestriction == null)
            return emptyList()
        return permissionRestriction
    }


}

