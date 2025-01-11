package Graph_Implementation

class Graph {
    private val adjList: HashMap<Int, MutableList<Int>> = HashMap()

    // Adds a vertex to the graph
    fun addVertex(vertex: Int) {
        if (!adjList.containsKey(vertex)) adjList[vertex] = mutableListOf()
    }

    // Adds an edge between two vertices
    fun addEdge(v1: Int, v2: Int) {
        adjList[v1]?.add(v2)
        adjList[v2]?.add(v1)  // Since it's an undirected graph
    }

    // Removes a vertex and its associated edges
    fun removeVertex(vertex: Int) {
        while (adjList[vertex]?.isNotEmpty() == true) {
            val adjacentVertex = adjList[vertex]?.first()
            removeEdge(vertex, adjacentVertex!!)
        }
        adjList.remove(vertex)
    }

    // Removes an edge between two vertices
    fun removeEdge(v1: Int, v2: Int) {
        adjList[v1]?.remove(v2)
        adjList[v2]?.remove(v1)
    }

    // Displays the graph
    fun display() {
        for ((vertex, edges) in adjList) {
            println("$vertex -> $edges")
        }
    }
}