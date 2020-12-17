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
Represents a dated comment by specific user.
 * @param timestamp 
 * @param text 
 * @param user 
 */
data class Comment(
    @SerializedName("timestamp") val timestamp: String? = null,
    @SerializedName("text") val text: String? = null,
    @SerializedName("user") val user: User? = null
) : DataEntity() {
    @Transient private val classModelName: String = "comment"


}

