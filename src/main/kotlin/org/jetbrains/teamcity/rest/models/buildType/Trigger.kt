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
Represents a build trigger.
 * @param id 
 * @param name 
 * @param type 
 * @param disabled 
 * @param inherited 
 * @param href 
 * @param properties 
 */
data class Trigger(
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("disabled") val disabled: Boolean? = null,
    @SerializedName("inherited") val inherited: Boolean? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("properties") val properties: Properties? = null
) : DataEntity() {
    @Transient private val classModelName: String = "trigger"


}
