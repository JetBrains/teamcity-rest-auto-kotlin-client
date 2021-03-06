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
Represents the dependency/queue settings with which this build has been started.
Related Help article: [Custom Build](https://www.jetbrains.com/help/teamcity/triggering-a-custom-build.html#Run+Custom+Build+dialog)
 * @param cleanSources 
 * @param cleanSourcesInAllDependencies 
 * @param rebuildAllDependencies 
 * @param rebuildFailedOrIncompleteDependencies 
 * @param queueAtTop 
 * @param freezeSettings 
 * @param tagDependencies 
 * @param rebuildDependencies 
 */
data class BuildTriggeringOptions(
    @SerializedName("cleanSources") val cleanSources: Boolean? = null,
    @SerializedName("cleanSourcesInAllDependencies") val cleanSourcesInAllDependencies: Boolean? = null,
    @SerializedName("rebuildAllDependencies") val rebuildAllDependencies: Boolean? = null,
    @SerializedName("rebuildFailedOrIncompleteDependencies") val rebuildFailedOrIncompleteDependencies: Boolean? = null,
    @SerializedName("queueAtTop") val queueAtTop: Boolean? = null,
    @SerializedName("freezeSettings") val freezeSettings: Boolean? = null,
    @SerializedName("tagDependencies") val tagDependencies: Boolean? = null,
    @SerializedName("rebuildDependencies") val rebuildDependencies: BuildTypes? = null
) : DataEntity() {
    @Transient private val classModelName: String = "buildTriggeringOptions"


}

