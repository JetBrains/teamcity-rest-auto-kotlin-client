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
Represents a list of File entities.
 * @param count 
 * @param file 
 */
data class FileChanges(
    @SerializedName("count") override val count: Int? = null,
    @SerializedName("file") val file: List<FileChange>? = null
) : ListEntity<FileChange>() {
    @Transient private val classModelName: String = "FileChanges"

    override fun items(): List<FileChange> {
        if (file == null)
            return emptyList()
        return file
    }


}
