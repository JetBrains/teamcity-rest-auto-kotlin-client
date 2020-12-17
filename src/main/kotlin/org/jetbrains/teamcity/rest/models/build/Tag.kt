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
Represents a single build tag.
Related Help article: [Tagging Build](https://www.jetbrains.com/help/teamcity/build-tag.html)
 * @param name 
 * @param owner 
 * @param &#x60;Private&#x60; 
 */
data class Tag(
    @SerializedName("name") val name: String? = null,
    @SerializedName("owner") val owner: User? = null,
    @SerializedName("private") val `Private`: Boolean? = null
) : DataEntity() {
    @Transient private val classModelName: String = "tag"


}

