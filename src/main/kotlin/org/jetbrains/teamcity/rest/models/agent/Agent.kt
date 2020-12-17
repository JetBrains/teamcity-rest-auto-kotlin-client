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
Represents a known agent instance.
Related Help article: [Build Agent](https://www.jetbrains.com/help/teamcity/build-agent.html)
 * @param id 
 * @param name 
 * @param typeId 
 * @param connected 
 * @param enabled 
 * @param authorized 
 * @param uptodate 
 * @param outdated 
 * @param pluginsOutdated 
 * @param javaOutdated 
 * @param ip 
 * @param protocol 
 * @param version 
 * @param currentAgentVersion 
 * @param lastActivityTime 
 * @param idleSinceTime 
 * @param disconnectionComment 
 * @param registrationTimestamp 
 * @param host 
 * @param cpuRank 
 * @param port 
 * @param href 
 * @param webUrl 
 * @param build 
 * @param links 
 * @param enabledInfo 
 * @param authorizedInfo 
 * @param properties 
 * @param cloudInstance 
 * @param cloudImage 
 * @param environment 
 * @param pool 
 * @param compatibilityPolicy 
 * @param compatibleBuildTypes 
 * @param incompatibleBuildTypes 
 * @param builds 
 * @param locator 
 */
data class Agent(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("typeId") val typeId: Int? = null,
    @SerializedName("connected") val connected: Boolean? = null,
    @SerializedName("enabled") val enabled: Boolean? = null,
    @SerializedName("authorized") val authorized: Boolean? = null,
    @SerializedName("uptodate") val uptodate: Boolean? = null,
    @SerializedName("outdated") val outdated: Boolean? = null,
    @SerializedName("pluginsOutdated") val pluginsOutdated: Boolean? = null,
    @SerializedName("javaOutdated") val javaOutdated: Boolean? = null,
    @SerializedName("ip") val ip: String? = null,
    @SerializedName("protocol") val protocol: String? = null,
    @SerializedName("version") val version: String? = null,
    @SerializedName("currentAgentVersion") val currentAgentVersion: String? = null,
    @SerializedName("lastActivityTime") val lastActivityTime: String? = null,
    @SerializedName("idleSinceTime") val idleSinceTime: String? = null,
    @SerializedName("disconnectionComment") val disconnectionComment: String? = null,
    @SerializedName("registrationTimestamp") val registrationTimestamp: String? = null,
    @SerializedName("host") val host: String? = null,
    @SerializedName("cpuRank") val cpuRank: Int? = null,
    @SerializedName("port") val port: Int? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("webUrl") val webUrl: String? = null,
    @SerializedName("build") val build: Build? = null,
    @SerializedName("links") val links: Links? = null,
    @SerializedName("enabledInfo") val enabledInfo: EnabledInfo? = null,
    @SerializedName("authorizedInfo") val authorizedInfo: AuthorizedInfo? = null,
    @SerializedName("properties") val properties: Properties? = null,
    @SerializedName("cloudInstance") val cloudInstance: CloudInstance? = null,
    @SerializedName("cloudImage") val cloudImage: CloudImage? = null,
    @SerializedName("environment") val environment: Environment? = null,
    @SerializedName("pool") val pool: AgentPool? = null,
    @SerializedName("compatibilityPolicy") val compatibilityPolicy: CompatibilityPolicy? = null,
    @SerializedName("compatibleBuildTypes") val compatibleBuildTypes: BuildTypes? = null,
    @SerializedName("incompatibleBuildTypes") val incompatibleBuildTypes: Compatibilities? = null,
    @SerializedName("builds") val builds: Builds? = null,
    @SerializedName("locator") val locator: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "agent"


}
