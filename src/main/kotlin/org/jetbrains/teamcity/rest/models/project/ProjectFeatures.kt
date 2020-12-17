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
Represents a list of ProjectFeature entities.
 * @param count 
 * @param href 
 * @param projectFeature 
 */
data class ProjectFeatures(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("projectFeature") val projectFeature: List<ProjectFeature>? = null
) : ListEntity<ProjectFeature>() {
    @Transient private val classModelName: String = "projectFeatures"

    override fun items(): List<ProjectFeature> {
        if (projectFeature == null)
            return emptyList()
        return projectFeature
    }


}
