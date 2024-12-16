package linkedList_Implementation

fun main(){
    val ll = LinkedList<Int>()
    ll.append(1)
    ll.append(2)
    ll.append(3)
    ll.prepend(0)
    println(ll.display())
    ll.deleteWithValue(4)
    println(ll.display())
}