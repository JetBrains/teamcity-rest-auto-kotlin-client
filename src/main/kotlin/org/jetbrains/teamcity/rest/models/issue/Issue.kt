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
Represents an issue related to the specific change.
 * @param id 
 * @param url 
 */
data class Issue(
    @SerializedName("id") val id: String? = null,
    @SerializedName("url") val url: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "Issue"


}

