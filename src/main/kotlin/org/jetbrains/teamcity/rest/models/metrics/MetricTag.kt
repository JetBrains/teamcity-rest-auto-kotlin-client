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
Represents a metric tag.
Related Help article: [Metrics](https://www.jetbrains.com/help/teamcity/teamcity-monitoring-and-diagnostics.html#Metrics)
 * @param name 
 * @param value 
 */
data class MetricTag(
    @SerializedName("name") val name: String? = null,
    @SerializedName("value") val value: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "metricTag"


}

