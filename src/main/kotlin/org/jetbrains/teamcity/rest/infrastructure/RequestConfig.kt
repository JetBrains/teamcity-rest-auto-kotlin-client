package org.jetbrains.teamcity.rest.infrastructure

data class RequestConfig(
        val method: RequestMethod,
        val path: String,
        val headers: Map<String, String> = mapOf(),
        val query: Map<String, List<String>> = mapOf(),
        val encodedQuery: String? = null
) {
    companion object {
        val pathPattern = "(\\/[a-zA-Z-]*)*".toRegex()
        val paramPattern: Regex = "([a-zA-Z]*)=([a-zA-Z:0-9,()]*)".toRegex()

        @JvmStatic
        fun fromExistingPath(
                method: RequestMethod,
                preparedPath: String,
                headers: Map<String, String> = mapOf()
        ): RequestConfig {
            return if (paramPattern.containsMatchIn(preparedPath) && pathPattern.containsMatchIn(preparedPath)) {
                val parsedPath = pathPattern.find(preparedPath)!!.value
                val query: MutableMap<String, List<String>> = HashMap()
                val paramMatches = paramPattern.findAll(preparedPath)
                paramMatches.forEach { matchResult ->
                    val groups = matchResult.groups
                    val name = groups[1]?.value
                    val value = groups[2]?.value
                    if (!name.isNullOrEmpty() && !value.isNullOrEmpty())
                        query[name] = listOf(value)
                }
                RequestConfig(method, parsedPath, query = query, headers = headers)
            } else {
                RequestConfig(
                        method, preparedPath, headers = headers
                )
            }
        }
    }
}