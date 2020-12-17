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
Represents a name-value-type relation.
 * @param name 
 * @param value 
 * @param inherited 
 * @param type 
 */
data class Property(
    @SerializedName("name") val name: String? = null,
    @SerializedName("value") val value: String? = null,
    @SerializedName("inherited") val inherited: Boolean? = null,
    @SerializedName("type") val type: Type? = null
) : DataEntity() {
    @Transient private val classModelName: String = "property"


}

