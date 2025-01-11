package queueDataStrucuture_Implementation

fun main(args: Array<String>) {
    val animals = Queue<String>(10)
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueue("Lion")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueue("Tiger")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueue("Crocodile")
    animals.enqueue("Cat")
    animals.enqueue("Dog")
    animals.enqueue("Cow")
    animals.enqueue("Cangaroo")
    animals.enqueue("Rat")
    animals.enqueue("Bull")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.enqueue("Ox")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.enqueue("Zebra")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.dequeue()
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    println()
    val languages = Queue(arrayOf("Kotlin", "Java"))
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.enqueue("C")
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.dequeue()
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.dequeue()
    println("$languages - Empty? -- ${languages.isEmpty()}")
    languages.dequeue()
    println("$languages - Empty? -- ${languages.isEmpty()}")

    // testQueueOf
    val languages1 = queueOf("Kotlin", "Java")
    println(languages1)
    languages1.enqueue("C")
    println(languages1)
    languages1.dequeue()
    println(languages1)
}