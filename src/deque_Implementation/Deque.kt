package deque_Implementation

class Deque<T> {
    private val elements : MutableList<T> = mutableListOf()

    fun addFront(item: T){
        elements.add(0,item)
    }

    fun addRear(item: T){
        elements.add(item)
    }

    fun removeFront(): T?{
        if(isEmpty()){
            return null
        }
        return elements.removeAt(0)
    }

    fun removeRear(): T?{
        if(isEmpty()){
            return null
        }
        return elements.removeAt(elements.size - 1)
    }

    fun peekFront(): T?{
        return elements.lastOrNull()
    }

    fun peekRear(): T?{
        return elements.firstOrNull()
    }

    fun getElements(){
        if(isEmpty()){
            println("Liste vide ! Veuillez ajouter des elements !")
        }else{
            elements.forEach{
                    t ->
                println("$t")
            }
        }

    }

    private fun isEmpty() = elements.isEmpty()
}