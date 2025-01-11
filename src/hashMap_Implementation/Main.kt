package hashMap_Implementation

fun main() {
    val hashMap = HashMap<String, Int>()
    hashMap.put("One", 1)
    hashMap.put("Two", 2)
    hashMap.put("Three", 3)
    println("Size of map: ${hashMap.size()}")
    println("Value of 'Two': ${hashMap.get("Two")}")
    hashMap.remove("Two")
    println("Size after removal: ${hashMap.size()}")
    println("Value of 'Two' after removal: ${hashMap.get("Two")}")
}