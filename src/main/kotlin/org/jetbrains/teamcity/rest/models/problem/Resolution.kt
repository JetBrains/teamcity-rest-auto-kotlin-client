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
Represents an investigation resolution timestamp and details.
 * @param type 
 * @param time 
 */
data class Resolution(
    @SerializedName("type") val type: String? = null,
    @SerializedName("time") val time: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "Resolution"


}

