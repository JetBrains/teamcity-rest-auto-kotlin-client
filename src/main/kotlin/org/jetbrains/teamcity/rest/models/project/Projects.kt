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
Represents a paginated list of Project entities.
 * @param count 
 * @param href 
 * @param nextHref 
 * @param prevHref 
 * @param project 
 */
data class Projects(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("project") val project: List<Project>? = null
) : PaginatedEntity<Project>() {
    @Transient private val classModelName: String = "projects"

    override fun items(): List<Project> {
        if (project == null)
            return emptyList()
        return project
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): Projects {
        val response = apiClient.request<Projects>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

