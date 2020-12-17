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
Represents a list of OperationResult entities.
 * @param count 
 * @param errorCount 
 * @param operationResult 
 */
data class MultipleOperationResult(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("errorCount") val errorCount: Int? = null,
    @SerializedName("operationResult") val operationResult: List<OperationResult>? = null
) : ListEntity<OperationResult>() {
    @Transient private val classModelName: String = "multipleOperationResult"

    override fun items(): List<OperationResult> {
        if (operationResult == null)
            return emptyList()
        return operationResult
    }


}

