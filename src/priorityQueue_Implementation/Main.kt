package priorityQueue_Implementation

fun main(){
    val pqQueue = PriorityQueue<String>()

    do{
        println(" ----------- Gestion d'une urgence ----------")
        println(" 1. Recevoir un patient \n 2. Traiter un patient \n 3. Voir le patient le plus urgent \n 4. Voir la liste des patients \n 5. Sortir")
        print("Entrer votre choix : ")
        val choice = readlnOrNull()

        when(choice){
            "1" -> {
                print("\n Entrer le nom du patient : ")
                val nom = readlnOrNull()
                if (nom != null){
                    print("Entrer la priorité(un nombre) : ")
                    val priority = readlnOrNull()
                    if(priority!= null){
                        pqQueue.enQueue(nom, priority.toInt())
                        println("Patient ajouté avec succès !")
                    }
                }
                println("Entrer un nom valide")
            }
            "2" ->{
                println("Patient traité ${pqQueue.peek()} !")
                pqQueue.deQueue()
            }
            "3" -> {
                if (pqQueue.peek() == null){
                    println("Liste de patient vide !")
                }else{
                    println(pqQueue.peek())
                }
            }
            "4" -> {
                pqQueue.getElements()
            }
            "5" -> println("")
            else -> println("Entrer un choix valide")
        }

    }while(choice != "5")
}