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
Represents the pinned status of this build.
Related Help article: [Pinning Build](https://www.jetbrains.com/help/teamcity/pinned-build.html)
 * @param status 
 * @param comment 
 */
data class PinInfo(
    @SerializedName("status") val status: Boolean? = null,
    @SerializedName("comment") val comment: Comment? = null
) : DataEntity() {
    @Transient private val classModelName: String = "pinInfo"


}

