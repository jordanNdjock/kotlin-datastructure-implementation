package binaryTree_Implementation

fun main() {
    val tree = BinaryTree()
    tree.insert(6)
    tree.insert(4)
    tree.insert(8)
    tree.insert(3)
    tree.insert(5)
    tree.insert(7)
    tree.insert(9)
    println("Pre-order traversal:")
    tree.preOrderTraversal(tree.root)
    println("\nIn-order traversal:")
    tree.inOrderTraversal(tree.root)
    println("\nPost-order traversal:")
    tree.postOrderTraversal(tree.root)
    println("\nSearch for 5: ${tree.search(5)}")
    println("Search for 10: ${tree.search(10)}")
    tree.delete(5)
    println("\nIn-order traversal after deleting 5:")
    tree.inOrderTraversal(tree.root)
}