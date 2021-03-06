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
Represents a paginated list of CloudProfile entities.
 * @param count 
 * @param nextHref 
 * @param prevHref 
 * @param href 
 * @param cloudProfile 
 */
data class CloudProfiles(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("cloudProfile") val cloudProfile: List<CloudProfile>? = null
) : PaginatedEntity<CloudProfile>() {
    @Transient private val classModelName: String = "cloudProfiles"

    override fun items(): List<CloudProfile> {
        if (cloudProfile == null)
            return emptyList()
        return cloudProfile
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): CloudProfiles {
        val response = apiClient.request<CloudProfiles>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

