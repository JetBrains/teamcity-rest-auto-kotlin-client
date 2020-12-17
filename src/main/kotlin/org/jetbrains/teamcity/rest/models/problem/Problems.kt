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
Represents a paginated list of Problem entities.
 * @param count 
 * @param nextHref 
 * @param prevHref 
 * @param problem 
 */
data class Problems(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("problem") val problem: List<Problem>? = null
) : PaginatedEntity<Problem>() {
    @Transient private val classModelName: String = "problems"

    override fun items(): List<Problem> {
        if (problem == null)
            return emptyList()
        return problem
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): Problems {
        val response = apiClient.request<Problems>(requestConfig)
        return ApiClient.processResponse(response)
    }

}
