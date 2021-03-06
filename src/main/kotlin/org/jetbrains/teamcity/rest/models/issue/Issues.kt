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
Represents a list of Issues entities.
 * @param issues 
 */
data class Issues(
    @SerializedName("issues") val issues: List<Issue>? = null
) : ListEntity<Issue>() {
    @Transient private val classModelName: String = "issues"

    override fun items(): List<Issue> {
        if (issues == null)
            return emptyList()
        return issues
    }


}

