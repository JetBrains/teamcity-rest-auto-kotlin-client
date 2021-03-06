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
Represents a list of Plugin entities.
 * @param count 
 * @param plugin 
 */
data class Plugins(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("plugin") val plugin: List<Plugin>? = null
) : ListEntity<Plugin>() {
    @Transient private val classModelName: String = "plugins"

    override fun items(): List<Plugin> {
        if (plugin == null)
            return emptyList()
        return plugin
    }


}

