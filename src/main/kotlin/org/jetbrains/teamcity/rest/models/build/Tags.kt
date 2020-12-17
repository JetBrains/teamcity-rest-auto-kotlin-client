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
Represents a list of Tag entities.
 * @param count 
 * @param tag 
 */
data class Tags(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("tag") val tag: List<Tag>? = null
) : ListEntity<Tag>() {
    @Transient private val classModelName: String = "tags"

    override fun items(): List<Tag> {
        if (tag == null)
            return emptyList()
        return tag
    }


}
