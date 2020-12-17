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
Represents a project.
Related Help article: [Project](https://www.jetbrains.com/help/teamcity/project.html)
 * @param id 
 * @param internalId 
 * @param uuid 
 * @param name 
 * @param parentProjectId 
 * @param parentProjectInternalId 
 * @param parentProjectName 
 * @param archived 
 * @param description 
 * @param href 
 * @param webUrl 
 * @param links 
 * @param parentProject 
 * @param readOnlyUI 
 * @param defaultTemplate 
 * @param buildTypes 
 * @param templates 
 * @param parameters 
 * @param vcsRoots 
 * @param projectFeatures 
 * @param projects 
 * @param cloudProfiles 
 * @param locator 
 */
data class Project(
    @SerializedName("id") val id: String? = null,
    @SerializedName("internalId") val internalId: String? = null,
    @SerializedName("uuid") val uuid: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("parentProjectId") val parentProjectId: String? = null,
    @SerializedName("parentProjectInternalId") val parentProjectInternalId: String? = null,
    @SerializedName("parentProjectName") val parentProjectName: String? = null,
    @SerializedName("archived") val archived: Boolean? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("webUrl") val webUrl: String? = null,
    @SerializedName("links") val links: Links? = null,
    @SerializedName("parentProject") val parentProject: Project? = null,
    @SerializedName("readOnlyUI") val readOnlyUI: StateField? = null,
    @SerializedName("defaultTemplate") val defaultTemplate: BuildType? = null,
    @SerializedName("buildTypes") val buildTypes: BuildTypes? = null,
    @SerializedName("templates") val templates: BuildTypes? = null,
    @SerializedName("parameters") val parameters: Properties? = null,
    @SerializedName("vcsRoots") val vcsRoots: VcsRoots? = null,
    @SerializedName("projectFeatures") val projectFeatures: ProjectFeatures? = null,
    @SerializedName("projects") val projects: Projects? = null,
    @SerializedName("cloudProfiles") val cloudProfiles: CloudProfiles? = null,
    @SerializedName("locator") val locator: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "project"


}
