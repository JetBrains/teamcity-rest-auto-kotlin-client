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
Represents a project state field (as of now, limited to the read-only state of project).
 * @param value 
 * @param inherited 
 */
data class StateField(
    @SerializedName("value") val value: Boolean? = null,
    @SerializedName("inherited") val inherited: Boolean? = null
) : DataEntity() {
    @Transient private val classModelName: String = "StateField"


}

