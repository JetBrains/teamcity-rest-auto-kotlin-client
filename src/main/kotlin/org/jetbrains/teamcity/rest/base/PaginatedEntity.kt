package org.jetbrains.teamcity.rest.base

import org.jetbrains.teamcity.rest.infrastructure.*
import org.slf4j.LoggerFactory

abstract class PaginatedEntity<T: DataEntity> : ListEntity<T>() {
    @Transient open val nextHref: String? = null
    @Transient open val prevHref: String? = null

    @Transient val LOG = LoggerFactory.getLogger(this.javaClass.name)

    fun getPaginatedIterator(clientConfig: ClientConfig): DataEntityPaginatedIterator<T> {
        return DataEntityPaginatedIterator(this, clientConfig)
    }

    private fun fetchNextPage(clientConfig: ClientConfig) : PaginatedEntity<T> {
        if (nextHref.isNullOrEmpty()) {
            throw NullPointerException("No link to next page.")
        }
        else {
            LOG.debug("Loading next page of the collection; nextHref: $nextHref")

            val requestConfig = RequestConfig.fromExistingPath(
                    RequestMethod.GET,
                    nextHref!!
            )
            val api = ApiClient(clientConfig)
            return requestNextPage(api, requestConfig)
        }
    }

    abstract fun requestNextPage(apiClient: ApiClient, requestConfig: RequestConfig): PaginatedEntity<T>

    companion object {
        class DataEntityPaginatedIterator<T : DataEntity>(
                private var collection: PaginatedEntity<T>,
                var clientConfig: ClientConfig
        ) : ListEntity.Companion.DataEntityIterator<T>(collection) {

            override fun hasNext(): Boolean {
                return if (!super.hasNext()) {
                    try {
                        collection = collection.fetchNextPage(clientConfig)
                    }
                    catch (e: NullPointerException) {
                        return false
                    }
                    index = 0
                    super.hasNext()
                } else {
                    super.hasNext()
                }
            }
        }
    }
}