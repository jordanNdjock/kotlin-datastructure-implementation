package deque_Implementation

fun main(){
    val deque = Deque<String>()

    deque.addFront("task 9")
    deque.addRear("task 2")
    deque.addRear("task 3")
    deque.addFront("task 6")
    deque.addRear("task 1")

    deque.getElements()
    println("Affichage de l'élement de debut de fin de la liste")
    println(deque.peekFront())
    println(deque.peekRear())
    println("Sorti des elements de debut et de fin !")
    deque.removeFront()
    deque.removeRear()
    deque.getElements()
}