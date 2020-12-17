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
Represents a locator string for filtering AgentPool entities.
Examples:
* `name:Default` – find Default agent pool details.
* `project:(<projectLocator>)` – find pool associated with project found by projectLocator.
 * @param agent Pool's agents locator.
 * @param id 
 * @param item [EXPERIMENTAL] Supply multiple locators and return a union of the results.
 * @param name 
 * @param project Pool's associated projects locator.
 */
class AgentPoolLocator(
    @SerializedName("agent") val agent: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("item") val item: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("project") val project: String? = null
) : LocatorEntity() {
    @Transient private val classModelName: String = "AgentPoolLocator"


}
