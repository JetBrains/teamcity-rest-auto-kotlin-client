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
Represents a build configuration.
 * @param id 
 * @param internalId 
 * @param name 
 * @param templateFlag 
 * @param type 
 * @param paused 
 * @param uuid 
 * @param description 
 * @param projectName 
 * @param projectId 
 * @param projectInternalId 
 * @param href 
 * @param webUrl 
 * @param inherited 
 * @param links 
 * @param project 
 * @param templates 
 * @param template 
 * @param vcsRootEntries 
 * @param settings 
 * @param parameters 
 * @param steps 
 * @param features 
 * @param triggers 
 * @param snapshotDependencies 
 * @param artifactDependencies 
 * @param agentRequirements 
 * @param branches 
 * @param builds 
 * @param investigations 
 * @param compatibleAgents 
 * @param vcsRootInstances 
 * @param locator 
 */
data class BuildType(
    @SerializedName("id") val id: String? = null,
    @SerializedName("internalId") val internalId: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("templateFlag") val templateFlag: Boolean? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("paused") val paused: Boolean? = null,
    @SerializedName("uuid") val uuid: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("projectName") val projectName: String? = null,
    @SerializedName("projectId") val projectId: String? = null,
    @SerializedName("projectInternalId") val projectInternalId: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("webUrl") val webUrl: String? = null,
    @SerializedName("inherited") val inherited: Boolean? = null,
    @SerializedName("links") val links: Links? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("templates") val templates: BuildTypes? = null,
    @SerializedName("template") val template: BuildType? = null,
    @SerializedName("vcs-root-entries") val vcsRootEntries: VcsRootEntries? = null,
    @SerializedName("settings") val settings: Properties? = null,
    @SerializedName("parameters") val parameters: Properties? = null,
    @SerializedName("steps") val steps: Steps? = null,
    @SerializedName("features") val features: Features? = null,
    @SerializedName("triggers") val triggers: Triggers? = null,
    @SerializedName("snapshot-dependencies") val snapshotDependencies: SnapshotDependencies? = null,
    @SerializedName("artifact-dependencies") val artifactDependencies: ArtifactDependencies? = null,
    @SerializedName("agent-requirements") val agentRequirements: AgentRequirements? = null,
    @SerializedName("branches") val branches: Branches? = null,
    @SerializedName("builds") val builds: Builds? = null,
    @SerializedName("investigations") val investigations: Investigations? = null,
    @SerializedName("compatibleAgents") val compatibleAgents: Agents? = null,
    @SerializedName("vcsRootInstances") val vcsRootInstances: VcsRootInstances? = null,
    @SerializedName("locator") val locator: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "buildType"


}

