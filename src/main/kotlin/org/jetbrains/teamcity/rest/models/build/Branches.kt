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
Represents a list of Branch entities.
 * @param count 
 * @param href 
 * @param branch 
 */
data class Branches(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("branch") val branch: List<Branch>? = null
) : ListEntity<Branch>() {
    @Transient private val classModelName: String = "branches"

    override fun items(): List<Branch> {
        if (branch == null)
            return emptyList()
        return branch
    }


}
