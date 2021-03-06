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
Represents a paginated list of Change entities.
 * @param count 
 * @param change 
 * @param href 
 * @param nextHref 
 * @param prevHref 
 */
data class Changes(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("change") val change: List<Change>? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null
) : PaginatedEntity<Change>() {
    @Transient private val classModelName: String = "changes"

    override fun items(): List<Change> {
        if (change == null)
            return emptyList()
        return change
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): Changes {
        val response = apiClient.request<Changes>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

