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
Represents a compatibility relation between agent and build configuration.
 * @param compatible 
 * @param agent 
 * @param buildType 
 * @param unmetRequirements 
 */
data class Compatibility(
    @SerializedName("compatible") val compatible: Boolean? = null,
    @SerializedName("agent") val agent: Agent? = null,
    @SerializedName("buildType") val buildType: BuildType? = null,
    @SerializedName("unmetRequirements") val unmetRequirements: Requirements? = null
) : DataEntity() {
    @Transient private val classModelName: String = "compatibility"


}

