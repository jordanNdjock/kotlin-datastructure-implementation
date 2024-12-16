package stack_Implementation

fun main(){
    val stack = Stack<String>()

    do {
    println("\n\n --------------- Valise d'habits pour un voyage ! ---------------")
    println("\n 1. AJouter un habit \n 2. Rétirer un habit \n 3. Voir le dernier habit ajouté \n 4. Voir les habits de la valise \n 5. Sortir ")
    print("\n Entrer votre choix : ")
    val choice = readlnOrNull()

    when(choice){
       "1" -> {
           println("\n Entrer le nom de l'habit : ")
           val input = readlnOrNull()
           if (input != null) {
               stack.push(input)
               println("Habit ajouté avec succès !")
           }else{
               println("Veuillez saisir un habit pour l'enregistrer !")
           }
       }
        "2" -> {
            if (stack.peek() != null){
                println("Cet habit sera retiré de la valise : ${stack.peek()}")
                println("Confirmez vous (O/N)?")
                val confirm = readlnOrNull()
                when(confirm){
                    "O" -> {
                        stack.pop()
                        println("Habit retiré avec succès !")
                    }
                    "N" -> {
                        println("Décidez vous !")
                    }
                    else -> println("Entrer soit O ou N")
                }
            }else{
                println("La valise est vide !")
            }

        }
        "3" -> {
            println(stack.peek())
        }
        "4" -> {
            stack.getElements()
        }
        "5" -> println("")
        else -> println("Veuillez entrer un choix correcte")
    }
    }while (choice != "5")
}