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
Represents a list of Data entities.
 * @param count 
 * @param data 
 */
data class Datas(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("data") val data: List<MetaData>? = null
) : ListEntity<MetaData>() {
    @Transient private val classModelName: String = "datas"

    override fun items(): List<MetaData> {
        if (data == null)
            return emptyList()
        return data
    }


}

