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
Represents a paginated list of Mute entities.
 * @param count 
 * @param nextHref 
 * @param prevHref 
 * @param href 
 * @param mute 
 */
data class Mutes(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("nextHref") override val nextHref: String? = null,
    @SerializedName("prevHref") override val prevHref: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("mute") val mute: List<Mute>? = null
) : PaginatedEntity<Mute>() {
    @Transient private val classModelName: String = "mutes"

    override fun items(): List<Mute> {
        if (mute == null)
            return emptyList()
        return mute
    }

    override fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): Mutes {
        val response = apiClient.request<Mutes>(requestConfig)
        return ApiClient.processResponse(response)
    }

}

