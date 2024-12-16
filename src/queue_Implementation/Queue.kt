package queue_Implementation

class Queue<T> {
    private val elements : MutableList<T> = mutableListOf()

    fun enQueue(item: T){
        elements.add(item)
    }

    fun deQueue(): T?{
        if(isEmpty()){
            return null
        }
        return elements.removeAt(0)
    }

    fun getElements(){
        if(isEmpty()){
            println("File vide, veuillez entrer des elements pour les afficher !")
        }
        elements.forEachIndexed { index, t ->
            println("${index + 1}. $t")
        }
    }

    fun peek(): T?{
        return elements.firstOrNull()
    }
    private fun isEmpty() = elements.isEmpty()
}