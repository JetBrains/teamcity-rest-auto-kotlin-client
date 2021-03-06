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
Represents a list of Trigger entities.
 * @param count 
 * @param trigger 
 */
data class Triggers(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("trigger") val trigger: List<Trigger>? = null
) : ListEntity<Trigger>() {
    @Transient private val classModelName: String = "triggers"

    override fun items(): List<Trigger> {
        if (trigger == null)
            return emptyList()
        return trigger
    }


}

