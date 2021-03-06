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
Represents a build configuration stub.
 * @param copyAllAssociatedSettings 
 * @param projectsIdsMap 
 * @param buildTypesIdsMap 
 * @param vcsRootsIdsMap 
 * @param name 
 * @param id 
 * @param sourceBuildTypeLocator 
 * @param sourceBuildType 
 */
data class NewBuildTypeDescription(
    @SerializedName("copyAllAssociatedSettings") val copyAllAssociatedSettings: Boolean? = null,
    @SerializedName("projectsIdsMap") val projectsIdsMap: Properties? = null,
    @SerializedName("buildTypesIdsMap") val buildTypesIdsMap: Properties? = null,
    @SerializedName("vcsRootsIdsMap") val vcsRootsIdsMap: Properties? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("sourceBuildTypeLocator") val sourceBuildTypeLocator: String? = null,
    @SerializedName("sourceBuildType") val sourceBuildType: BuildType? = null
) : DataEntity() {
    @Transient private val classModelName: String = "newBuildTypeDescription"


}

