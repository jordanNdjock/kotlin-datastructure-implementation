package doublyLinkylist_Implementation

import DoublyLinkyList
import linkyList_Implementation.*
import testAdd
import testGetFirst

fun main() {
    val doublyLinkyList = DoublyLinkyList<String>()
    println("First item of the linky list is - ${doublyLinkyList.getFirst()}")
    println("Last item of the linky list is - ${doublyLinkyList.getLast()}")

    println()
    doublyLinkyList.add("Kotlin")
    println("First item of the linky list is - ${doublyLinkyList.getFirst()}")
    println("Last item of the linky list is - ${doublyLinkyList.getLast()}")

    println()
    doublyLinkyList.add("Java")
    println("First item of the linky list is - ${doublyLinkyList.getFirst()}")
    println("Last item of the linky list is - ${doublyLinkyList.getLast()}")

    doublyLinkyList.add("C#")
    doublyLinkyList.add("Python")
    doublyLinkyList.add("JavaScript")

    println()
    println("Elements at doublyLinkyList - $doublyLinkyList")
    doublyLinkyList.remove("JavaScript")
    println("Elements at doublyLinkyList after removing JavaScript - $doublyLinkyList")
    doublyLinkyList.remove("Kotlin")
    println("Elements at doublyLinkyList after removing Kotlin - $doublyLinkyList")
    doublyLinkyList.remove("C#")
    println("Elements at doublyLinkyList after removing C# - $doublyLinkyList")
    doublyLinkyList.remove("Java")
    println("Elements at doublyLinkyList after removing Java - $doublyLinkyList")
    doublyLinkyList.remove("Python")
    println("Elements at doublyLinkyList after removing Python - $doublyLinkyList")

    testGetFirst()
    testAdd()
    testGet()
    testSet()
    testRemoveFirst()
    testRemoveLast()
    testRemoveValue()
    testAddAll()
}