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

 * @param type 
 * @param unknown 
 * @param internalId 
 * @param text 
 * @param build 
 * @param buildType 
 * @param project 
 * @param user 
 * @param group 
 * @param test 
 * @param problem 
 * @param agent 
 * @param vcsRoot 
 * @param change 
 * @param agentPool 
 */
data class RelatedEntity(
    @SerializedName("type") val type: String? = null,
    @SerializedName("unknown") val unknown: Boolean? = null,
    @SerializedName("internalId") val internalId: String? = null,
    @SerializedName("text") val text: String? = null,
    @SerializedName("build") val build: Build? = null,
    @SerializedName("buildType") val buildType: BuildType? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("user") val user: User? = null,
    @SerializedName("group") val group: Group? = null,
    @SerializedName("test") val test: Test? = null,
    @SerializedName("problem") val problem: Problem? = null,
    @SerializedName("agent") val agent: Agent? = null,
    @SerializedName("vcsRoot") val vcsRoot: VcsRoot? = null,
    @SerializedName("change") val change: Change? = null,
    @SerializedName("agentPool") val agentPool: AgentPool? = null
) : DataEntity() {
    @Transient private val classModelName: String = "relatedEntity"


}

