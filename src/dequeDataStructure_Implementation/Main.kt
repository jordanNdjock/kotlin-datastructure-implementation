package dequeDataStructure_Implementation

fun main(args: Array<String>) {
    val animals = Deque<String>(10)
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueueRear("Lion")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueueRear("Tiger")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")

    animals.enqueueRear("Crocodile")
    animals.enqueueRear("Cat")
    animals.enqueueRear("Dog")
    animals.enqueueRear("Cow")
    animals.enqueueRear("Cangaroo")
    animals.enqueueRear("Rat")
    animals.enqueueRear("Bull")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.enqueueRear("Ox")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.enqueueRear("Zebra")
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.dequeueFront()
    System.out.println("$animals - Empty? -- ${animals.isEmpty()}")
    animals.dequeueFront()
    println("Animals - $animals")
    animals.dequeueRear()
    println("Animals - $animals")
    animals.enqueueFront("Zebra")
    println("Animals - $animals")
    animals.enqueueRear("Tiger")
    println("Animals - $animals")
    animals.enqueueFront("Octopus")
    println("Animals - $animals")
}