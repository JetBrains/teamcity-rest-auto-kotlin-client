package org.jetbrains.teamcity.rest.apis

import com.google.gson.GsonBuilder
import org.jetbrains.teamcity.rest.infrastructure.*
import org.jetbrains.teamcity.rest.models.*

class AuditApi(clientConfig : ClientConfig) : ApiClient(clientConfig) {

    /**
    * Get all audit events.
    * Runs GET request on "/app/rest/audit" endpoint.
    * @param locator  (optional)
    * @param fields  (optional)
    * @return AuditEvents
    */
    fun getAllAuditEvents(
                    locator: String? = null,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AuditEvents {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        locator?.let { localQuery["locator"] = listOf("$locator") }
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/audit",
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AuditEvents>(
            localVariableConfig
        )
        return processResponse(response)
    }

    /**
    * Get audit event matching the locator.
    * Runs GET request on "/app/rest/audit/{auditEventLocator}" endpoint.
    * @param auditEventLocator  
    * @param fields  (optional)
    * @return AuditEvent
    */
    fun getAuditEvent(
                    auditEventLocator: String,
                    fields: String? = null,
                    extraHeaders: Map<String, String> = jsonHeaders
    ) : AuditEvent {


        val localQuery: MutableMap<String,List<String>> = HashMap()
        fields?.let { localQuery["fields"] = listOf("$fields") }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/app/rest/audit/{auditEventLocator}".replace("{"+"auditEventLocator"+"}", "$auditEventLocator"),
            query = localQuery,
            headers = extraHeaders
        )

        val response = request<AuditEvent>(
            localVariableConfig
        )
        return processResponse(response)
    }

}
