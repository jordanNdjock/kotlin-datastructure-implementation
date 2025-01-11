package Graph_Implementation

fun main() {
    val graph = Graph()
    graph.addVertex(1)
    graph.addVertex(2)
    graph.addVertex(3)
    graph.addVertex(4)
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 4)
    graph.addEdge(3, 4)
    graph.display()
    graph.removeEdge(2, 4)
    graph.removeVertex(3)
    graph.display()
}