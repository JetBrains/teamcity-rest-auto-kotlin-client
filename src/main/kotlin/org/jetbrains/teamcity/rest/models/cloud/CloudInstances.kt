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
Represents a paginated list of CloudInstance entities.
 * @param count 
 * @param nextHref 
 * @param prevHref 
 * @param href 
 * @param cloudInstance 
 */
data class CloudInstances(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("cloudInstance") val cloudInstance: List<CloudInstance>? = null
) : PaginatedEntity<CloudInstance>() {
    @Transient private val classModelName: String = "cloudInstances"

    override fun items(): List<CloudInstance> {
        if (cloudInstance == null)
            return emptyList()
        return cloudInstance
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): CloudInstances {
        val response = apiClient.request<CloudInstances>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

