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
Represents a locator string for filtering queued Build entities.
Examples:
* `buildType:<buildTypeLocator>` – find queued builds under build configuration found by buildTypeLocator.
* `user:<userLocator>` – find queued builds started by user found by userLocator.
 * @param singleValue Return a single value.
 * @param agent Agent locator.
 * @param buildType Build type locator.
 * @param count For paginated calls, how many entities to return per page.
 * @param id Entity ID.
 * @param item [EXPERIMENTAL] Supply multiple locators and return a union of the results.
 * @param personal Is personal.
 * @param pool Agent pool locator.
 * @param project Project locator.
 * @param start For paginated calls, from which entity to start rendering the page.
 * @param taskId 
 * @param user User locator.
 */
class BuildQueueLocator(
    @SerializedName("\$singleValue") val singleValue: Boolean? = null,
    @SerializedName("agent") val agent: String? = null,
    @SerializedName("buildType") val buildType: String? = null,
    @SerializedName("count") val count: Int? = null,
    @SerializedName("id") val id: Int? = null,
    @SerializedName("item") val item: String? = null,
    @SerializedName("personal") val personal: Boolean? = null,
    @SerializedName("pool") val pool: String? = null,
    @SerializedName("project") val project: String? = null,
    @SerializedName("start") val start: Int? = null,
    @SerializedName("taskId") val taskId: String? = null,
    @SerializedName("user") val user: String? = null
) : LocatorEntity() {
    @Transient private val classModelName: String = "BuildQueueLocator"


}

