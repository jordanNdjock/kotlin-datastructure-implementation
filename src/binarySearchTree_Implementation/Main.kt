package binarySearchTree_Implementation

fun main() {
    val bst = BinarySearchTree()
    bst.insert(50)
    bst.insert(30)
    bst.insert(70)
    bst.insert(20)
    bst.insert(40)
    bst.insert(60)
    bst.insert(80)
    println("In-order traversal:")
    bst.inOrderTraversal(bst.root)
    println("\nPre-order traversal:")
    bst.preOrderTraversal(bst.root)
    println("\nPost-order traversal:")
    bst.postOrderTraversal(bst.root)
    println("\nSearch for 40: ${bst.search(40)}")
    println("Search for 100: ${bst.search(100)}")
    println("\nMinimum value: ${bst.findMin()}")
    println("Maximum value: ${bst.findMax()}")
    bst.delete(40)
    println("\nAfter deleting 40:")
    bst.inOrderTraversal(bst.root)
    bst.delete(50)
    println("\nAfter deleting 50:")
    bst.inOrderTraversal(bst.root)
}