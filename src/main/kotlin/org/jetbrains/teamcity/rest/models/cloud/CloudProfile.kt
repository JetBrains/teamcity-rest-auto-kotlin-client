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
Represents a cloud agent profile.
Related Help article: [Cloud Profile](https://www.jetbrains.com/help/teamcity/agent-cloud-profile.html)
 * @param id 
 * @param name 
 * @param cloudProviderId 
 * @param href 
 * @param project 
 * @param images 
 */
data class CloudProfile(
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("cloudProviderId") val cloudProviderId: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("images") val images: CloudImages? = null
) : DataEntity() {
    @Transient private val classModelName: String = "cloudProfile"


}

