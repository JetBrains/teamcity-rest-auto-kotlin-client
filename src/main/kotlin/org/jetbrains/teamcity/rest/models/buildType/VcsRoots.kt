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
Represents a paginated list of Vcs-root entities.
 * @param count 
 * @param href 
 * @param nextHref 
 * @param prevHref 
 * @param vcsRoot 
 */
data class VcsRoots(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("vcs-root") val vcsRoot: List<VcsRoot>? = null
) : PaginatedEntity<VcsRoot>() {
    @Transient private val classModelName: String = "vcs-roots"

    override fun items(): List<VcsRoot> {
        if (vcsRoot == null)
            return emptyList()
        return vcsRoot
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): VcsRoots {
        val response = apiClient.request<VcsRoots>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

