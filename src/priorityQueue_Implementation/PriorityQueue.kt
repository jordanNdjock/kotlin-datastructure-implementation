package priorityQueue_Implementation

data class PQElement<T> ( val data : T, val priority : Int)

class PriorityQueue<T> {
    private val pqElements : MutableList<PQElement<T>> = mutableListOf()

    fun enQueue(item: T, priority: Int){
        val pqElement = PQElement(item, priority)
        pqElements.add(pqElement)
        pqElements.sortByDescending { it.priority }
    }

    fun getElements(){
        if(isEmpty()){
            println("File prioritaire vide, veuillez entrer des elements avec leur priorité !")
        }
        pqElements.forEachIndexed { index, pqElement ->
            println("${index + 1}. ${pqElement.data} priorité : ${pqElement.priority}")
        }
    }

    fun deQueue () : T?{
        if (isEmpty()){
            return null
        }
        return pqElements.removeAt(0).data
    }

    fun peek(): T?{
        return pqElements.firstOrNull()?.data
    }

    private fun isEmpty() = pqElements.isEmpty()
}