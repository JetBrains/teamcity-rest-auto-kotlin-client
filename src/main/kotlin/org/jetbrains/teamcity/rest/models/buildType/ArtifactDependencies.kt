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
Represents a list of Artifact-dependency entities.
 * @param count 
 * @param artifactDependency 
 * @param replace 
 */
data class ArtifactDependencies(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("artifact-dependency") val artifactDependency: List<ArtifactDependency>? = null,
    @SerializedName("replace") val replace: String? = null
) : ListEntity<ArtifactDependency>() {
    @Transient private val classModelName: String = "artifact-dependencies"

    override fun items(): List<ArtifactDependency> {
        if (artifactDependency == null)
            return emptyList()
        return artifactDependency
    }


}

