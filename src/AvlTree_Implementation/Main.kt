package AvlTree_Implementation

fun main() {
    var tree: Node? = null
    val avlTree = AVLTree()
    tree = avlTree.insert(tree, 10)
    tree = avlTree.insert(tree, 20)
    tree = avlTree.insert(tree, 30)
    tree = avlTree.insert(tree, 40)
    tree = avlTree.insert(tree, 50)
    tree = avlTree.insert(tree, 25)
    println("Preorder traversal of constructed AVL tree:")
    avlTree.preOrder(tree)
    tree = avlTree.delete(tree, 10)
    println("\nPreorder traversal after deleting 10:")
    avlTree.preOrder(tree)
}