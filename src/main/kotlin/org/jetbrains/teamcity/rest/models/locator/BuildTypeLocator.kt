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
Represents a locator string for filtering BuildType entities.
Examples:
* `name:MyBuildType` – find build configuration with MyBuildType name
* `project:<projectLocator>` – find build configurations under project found by projectLocator
 * @param singleValue Return a single value.
 * @param affectedProject Project (direct or indirect parent) locator.
 * @param build Build locator.
 * @param count For paginated calls, how many entities to return per page.
 * @param id 
 * @param internalId 
 * @param item [EXPERIMENTAL] Supply multiple locators and return a union of the results.
 * @param name 
 * @param paused Is paused.
 * @param project Project (direct parent) locator.
 * @param start For paginated calls, from which entity to start rendering the page.
 * @param template Base template locator.
 * @param templateFlag Is a template.
 * @param uuid 
 * @param vcsRoot VCS root locator.
 * @param vcsRootInstance VCS root instance locator.
 */
class BuildTypeLocator(
    @SerializedName("\$singleValue") val singleValue: Boolean? = null,
    @SerializedName("affectedProject") val affectedProject: String? = null,
    @SerializedName("build") val build: String? = null,
    @SerializedName("count") val count: Int? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("internalId") val internalId: String? = null,
    @SerializedName("item") val item: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("paused") val paused: Boolean? = null,
    @SerializedName("project") val project: String? = null,
    @SerializedName("start") val start: Int? = null,
    @SerializedName("template") val template: String? = null,
    @SerializedName("templateFlag") val templateFlag: Boolean? = null,
    @SerializedName("uuid") val uuid: String? = null,
    @SerializedName("vcsRoot") val vcsRoot: String? = null,
    @SerializedName("vcsRootInstance") val vcsRootInstance: String? = null
) : LocatorEntity() {
    @Transient private val classModelName: String = "BuildTypeLocator"


}

