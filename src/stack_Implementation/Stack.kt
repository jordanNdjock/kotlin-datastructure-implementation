package stack_Implementation

class Stack<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun push(item : T){
        elements.add(item)
    }

    fun pop(): T?{
        if (elements.isEmpty()){
            return null
        }
        return elements.removeAt(elements.size - 1)
    }

    fun peek(): T?{
        return elements.lastOrNull()
    }

    fun getElements(){
        if (!isEmpty()){
            elements.forEachIndexed{
                    index, t ->
                println("${index + 1}. $t")
            }
        }else{
            println("\n La valise est vide, veuillez ajouter des habits")
        }
    }

    private fun isEmpty() = elements.isEmpty()
}