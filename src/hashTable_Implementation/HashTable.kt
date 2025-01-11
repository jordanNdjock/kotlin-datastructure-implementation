package hashTable_Implementation

class HashTable<K, V>(private val size: Int) {
    private val storage: Array<MutableList<Pair<K, V>>> = Array(size) { mutableListOf() }

    // 3. Simple hash function to convert keys into indices
    private fun hash(key: K): Int = key.hashCode() % size

    // 4. Insert a key-value pair into the hash table
    fun put(key: K, value: V) {
        val index = hash(key)
        storage[index].add(Pair(key, value))
    }

    // 5. Retrieve a value for a given key from the hash table
    fun get(key: K): V? {
        val index = hash(key)
        for (entry in storage[index]) {
            if (entry.first == key) {
                return entry.second
            }
        }
        return null
    }

    // 6. Remove a key-value pair from the hash table
    fun remove(key: K) {
        val index = hash(key)
        val iterator = storage[index].iterator()
        while (iterator.hasNext()) {
            if (iterator.next().first == key) {
                iterator.remove()
                return
            }
        }
    }
}