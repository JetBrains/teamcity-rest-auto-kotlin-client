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

 * @param licenseUseExceeded 
 * @param maxAgents 
 * @param unlimitedAgents 
 * @param agentsLeft 
 * @param maxBuildTypes 
 * @param unlimitedBuildTypes 
 * @param buildTypesLeft 
 * @param serverLicenseType 
 * @param serverEffectiveReleaseDate 
 * @param licenseKeys 
 */
data class LicensingData(
    @SerializedName("licenseUseExceeded") val licenseUseExceeded: Boolean? = null,
    @SerializedName("maxAgents") val maxAgents: Int? = null,
    @SerializedName("unlimitedAgents") val unlimitedAgents: Boolean? = null,
    @SerializedName("agentsLeft") val agentsLeft: Int? = null,
    @SerializedName("maxBuildTypes") val maxBuildTypes: Int? = null,
    @SerializedName("unlimitedBuildTypes") val unlimitedBuildTypes: Boolean? = null,
    @SerializedName("buildTypesLeft") val buildTypesLeft: Int? = null,
    @SerializedName("serverLicenseType") val serverLicenseType: String? = null,
    @SerializedName("serverEffectiveReleaseDate") val serverEffectiveReleaseDate: String? = null,
    @SerializedName("licenseKeys") val licenseKeys: LicenseKeys? = null
) : DataEntity() {
    @Transient private val classModelName: String = "licensingData"


}

