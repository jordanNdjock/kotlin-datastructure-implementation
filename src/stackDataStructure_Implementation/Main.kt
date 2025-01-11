package stackDataStructure_Implementation

fun main(args: Array<String>) {
    val animals = Stack<String>(10)
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.push("Lion")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.push("Tiger")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.push("Crocodile")
    animals.push("Cat")
    animals.push("Dog")
    animals.push("Cow")
    animals.push("Cangaroo")
    animals.push("Rat")
    animals.push("Bull")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.push("Ox")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.push("Zebra")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.pop()
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    println()
    val languages = Stack(arrayOf("Kotlin", "Java"))
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.push("C")
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.pop()
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.pop()
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.pop()
    println("$languages - Empty? -- ${languages.isEmpty()}")

    testPushAll()
    testPop()
    testStackOf()
}

fun testPushAll() {
    println()
    println("Testing pushAll")
    val numbers = Stack<Int>(10)
    numbers.pushAll(Array<Int>(100) { i -> i })
    println(numbers)
    numbers.pop()
    numbers.pushAll(arrayOf(1, 2, 12, 909))
    println(numbers)
}

fun testPop() {
    println()
    println("Testing pop count")
    val numbers = Stack<Int>(10)
    numbers.pushAll(Array<Int>(100) { i -> i })
    println(numbers)
    numbers.pop(20)
    numbers.pushAll(arrayOf(1, 2, 12, 909))
    println(numbers)
}

fun testStackOf() {
    val languages = stackOf("Kotlin", "Java")
    println(languages)
    languages.push("C")
    println(languages)
    languages.pop()
    println(languages)
}