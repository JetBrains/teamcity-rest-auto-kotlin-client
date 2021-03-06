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
Represents a relation between message and related entity.
 * @param message 
 * @param related 
 */
data class OperationResult(
    @SerializedName("message") val message: String? = null,
    @SerializedName("related") val related: RelatedEntity? = null
) : DataEntity() {
    @Transient private val classModelName: String = "operationResult"


}

