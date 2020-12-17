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
Represents a branch version.
 * @param version 
 * @param name 
 * @param default 
 * @param active 
 * @param internalName 
 * @param unspecified 
 * @param builds 
 * @param lastActivity 
 * @param groupFlag 
 */
data class BranchVersion(
    @SerializedName("version") val version: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("default") val default: Boolean? = null,
    @SerializedName("active") val active: Boolean? = null,
    @SerializedName("internalName") val internalName: String? = null,
    @SerializedName("unspecified") val unspecified: Boolean? = null,
    @SerializedName("builds") val builds: Builds? = null,
    @SerializedName("lastActivity") val lastActivity: String? = null,
    @SerializedName("groupFlag") val groupFlag: Boolean? = null
) : DataEntity() {
    @Transient private val classModelName: String = "branchVersion"


}

