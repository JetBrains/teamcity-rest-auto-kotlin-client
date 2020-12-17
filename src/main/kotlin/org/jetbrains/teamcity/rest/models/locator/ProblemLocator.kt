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
Represents a locator string for filtering Problem entities.
Examples:
* `currentlyInvestigated:true` – find last 100 build problems which are being currently investigated.
* `build:<buildLocator>` – find build problems under build found by buildLocator.
 * @param singleValue Return a single value.
 * @param affectedProject Project (direct or indirect parent) locator.
 * @param build Build locator.
 * @param count For paginated calls, how many entities to return per page.
 * @param currentlyFailing Is currently failing.
 * @param currentlyInvestigated Is currently investigated.
 * @param currentlyMuted Is currently muted.
 * @param id Entity ID.
 * @param identity 
 * @param item [EXPERIMENTAL] Supply multiple locators and return a union of the results.
 * @param lookupLimit Limit processing to the latest `<lookupLimit>` entities.
 * @param start For paginated calls, from which entity to start rendering the page.
 * @param type 
 */
class ProblemLocator(
    @SerializedName("\$singleValue") val singleValue: Boolean? = null,
    @SerializedName("affectedProject") val affectedProject: String? = null,
    @SerializedName("build") val build: String? = null,
    @SerializedName("count") val count: Int? = null,
    @SerializedName("currentlyFailing") val currentlyFailing: Boolean? = null,
    @SerializedName("currentlyInvestigated") val currentlyInvestigated: Boolean? = null,
    @SerializedName("currentlyMuted") val currentlyMuted: Boolean? = null,
    @SerializedName("id") val id: Int? = null,
    @SerializedName("identity") val identity: String? = null,
    @SerializedName("item") val item: String? = null,
    @SerializedName("lookupLimit") val lookupLimit: Int? = null,
    @SerializedName("start") val start: Int? = null,
    @SerializedName("type") val type: String? = null
) : LocatorEntity() {
    @Transient private val classModelName: String = "ProblemLocator"


}
