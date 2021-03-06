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
Represents a file.
 * @param name 
 * @param fullName 
 * @param size 
 * @param modificationTime 
 * @param href 
 * @param parent 
 * @param content 
 * @param children 
 */
data class File(
    @SerializedName("name") val name: String? = null,
    @SerializedName("fullName") val fullName: String? = null,
    @SerializedName("size") val size: Long? = null,
    @SerializedName("modificationTime") val modificationTime: String? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("parent") val parent: File? = null,
    @SerializedName("content") val content: Href? = null,
    @SerializedName("children") val children: Files? = null
) : DataEntity() {
    @Transient private val classModelName: String = "file"


}

