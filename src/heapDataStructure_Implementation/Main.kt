package heapDataStructure_Implementation

fun main() {
    val minHeap = Heap()
    val maxHeap = Heap(isMinHeap = false)
    listOf(5, 3, 8, 1, 4).forEach {
        minHeap.add(it)
        maxHeap.add(it)
    }
    minHeap.display()
    maxHeap.display()
    println("Min peak: ${minHeap.removePeak()}")
    println("Max peak: ${maxHeap.removePeak()}")
    minHeap.display()
    maxHeap.display()
}