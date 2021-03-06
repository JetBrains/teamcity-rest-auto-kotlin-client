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
Represents a list of Link entities.
 * @param count 
 * @param link 
 */
data class Links(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("link") val link: List<Link>? = null
) : ListEntity<Link>() {
    @Transient private val classModelName: String = "links"

    override fun items(): List<Link> {
        if (link == null)
            return emptyList()
        return link
    }


}

