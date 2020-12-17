package org.jetbrains.teamcity.rest.base

abstract class ListEntity<T : DataEntity> {
    @Transient open val href: String? = null
    @Transient open val count: Int? = null

    abstract fun items(): List<T>

    fun getIterator(): DataEntityIterator<T> {
        return DataEntityIterator(this)
    }

    companion object {
        open class DataEntityIterator<T: DataEntity>(
                private val collection: ListEntity<T>
        ) : Iterator<T> {
            protected var index = 0

            private val size: Int
                get() = collection.items().size

            override fun hasNext(): Boolean  = index < size

            private fun checkIfExhausted() {
                if (!hasNext()) {
                    if (size == 0) {
                        throw NoSuchElementException("This entity collection is empty.")
                    }
                    throw NoSuchElementException("This entity collection is exhausted.")
                }
            }

            fun get(index: Int): T {
                return collection.items()[index]
            }

            override fun next() : T {
                checkIfExhausted()
                return get(index++)
            }
        }
    }
}