package hashTable_Implementation

fun main() {
    val hashTable = HashTable<String, String>(10)
    hashTable.put("John", "Engineer")
    hashTable.put("Jane", "Doctor")
    hashTable.put("Mike", "Architect")
    println("John is an ${hashTable.get("John")}")
    println("Jane is an ${hashTable.get("Jane")}")
    hashTable.remove("Jane")
    println("After removing Jane: Jane is an ${hashTable.get("Jane")}")
}