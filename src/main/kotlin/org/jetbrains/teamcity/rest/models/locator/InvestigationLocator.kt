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
Represents a locator string for filtering Investigation entities.
Examples:
* `assignee:John Doe` – find investigations assigned to John Doe.
* `state:taken` – find investigations which are currently in work.
 * @param affectedProject Project (direct or indirect parent) locator.
 * @param assignee 
 * @param assignmentProject Project (direct parent) locator.
 * @param buildType Build type locator.
 * @param count For paginated calls, how many entities to return per page.
 * @param item [EXPERIMENTAL] Supply multiple locators and return a union of the results.
 * @param lookupLimit Limit processing to the latest `<lookupLimit>` entities.
 * @param problem Problem locator.
 * @param reporter 
 * @param resolution Supported values: manually/whenFixed/atTime.
 * @param sinceDate yyyyMMddTHHmmss+ZZZZ
 * @param start For paginated calls, from which entity to start rendering the page.
 * @param state Supported values: taken/fixed/given_up/none.
 * @param test Test locator.
 * @param type Supported values: test/problem/anyProblem/unknown.
 */
class InvestigationLocator(
    @SerializedName("affectedProject") val affectedProject: String? = null,
    @SerializedName("assignee") val assignee: String? = null,
    @SerializedName("assignmentProject") val assignmentProject: String? = null,
    @SerializedName("buildType") val buildType: String? = null,
    @SerializedName("count") val count: Int? = null,
    @SerializedName("item") val item: String? = null,
    @SerializedName("lookupLimit") val lookupLimit: Int? = null,
    @SerializedName("problem") val problem: String? = null,
    @SerializedName("reporter") val reporter: String? = null,
    @SerializedName("resolution") val resolution: String? = null,
    @SerializedName("sinceDate") val sinceDate: LocalDateTime? = null,
    @SerializedName("start") val start: Int? = null,
    @SerializedName("state") val state: String? = null,
    @SerializedName("test") val test: String? = null,
    @SerializedName("type") val type: String? = null
) : LocatorEntity() {
    @Transient private val classModelName: String = "InvestigationLocator"


}

