package queue_Implementation

fun main(){
    val queue = Queue<String>()

    do {
        println("\n ----------------------- Salle d'attente dans un service public ! -----------------------")
        println(" 1. Reçevoir un client \n 2. Traiter la demande d'un client \n 3. Voir le premier client \n 4. Voir la liste des clients \n 5. Sortir du programme ")
        print("\n Entrer votre choix : ")

        val choice = readlnOrNull()

        when(choice){
            "1" -> {
                print("\n Entrer le nom du client : ")
                val input = readlnOrNull()
                if (input != null){
                    queue.enQueue(input)
                    println("\n Client ajouté avec succès à la file")
                }
                else{
                    println("Entrer un nom correcte !")
                }
            }
            "2" -> {
                println("Demande du client ${queue.peek()} traité ")
                queue.deQueue()
            }
            "3" -> {
                println(queue.peek())
            }
            "4" -> {
                queue.getElements()
            }
            "5" -> println("")
            else -> println("Veuillez entrer un choix correcte !")
        }
    }while (choice != "5")
}