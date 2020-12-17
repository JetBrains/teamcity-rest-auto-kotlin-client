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
Represents links on last or previous VCS root check.
Related Help article: [VCS Root](https://www.jetbrains.com/help/teamcity/configuring-vcs-roots.html)
 * @param current 
 * @param previous 
 */
data class VcsStatus(
    @SerializedName("current") val current: VcsCheckStatus? = null,
    @SerializedName("previous") val previous: VcsCheckStatus? = null
) : DataEntity() {
    @Transient private val classModelName: String = "vcsStatus"


}

