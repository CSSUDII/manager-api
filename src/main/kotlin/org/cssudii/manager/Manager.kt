package org.cssudii.manager


abstract class Manager<IdType, T : ManagerType<IdType>> {
    private val entries = HashMap<IdType, T>()
    fun add(entry: T): Manager<IdType, T> {
        entry.id?.let { entries.put(it, entry) }
        return this
    }

    operator fun get(identifier: IdType): T? {
        return entries[identifier]
    }

    fun getEntries(): List<T> {
        return if (entries.size > 0) {
            ArrayList(entries.values)
        } else ArrayList()
    }
}