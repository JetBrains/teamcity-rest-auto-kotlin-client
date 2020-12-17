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
Represents a test.
 * @param id 
 * @param name 
 * @param mutes 
 * @param investigations 
 * @param testOccurrences 
 * @param parsedTestName 
 * @param href 
 * @param locator 
 */
data class Test(
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("mutes") val mutes: Mutes? = null,
    @SerializedName("investigations") val investigations: Investigations? = null,
    @SerializedName("testOccurrences") val testOccurrences: TestOccurrences? = null,
    @SerializedName("parsedTestName") val parsedTestName: ParsedTestName? = null,
    @SerializedName("href") override val href: String? = null,
    @SerializedName("locator") val locator: String? = null
) : DataEntity() {
    @Transient private val classModelName: String = "test"


}
