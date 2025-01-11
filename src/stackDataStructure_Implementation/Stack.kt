package stackDataStructure_Implementation
import java.util.Arrays

class Stack<E> {
    private val minCapacityIncrement = 12

    private var elements: Array<Any?>
    private var size = 0

    constructor() {
        this.elements = arrayOf()
    }

    constructor(initialCapacity: Int) {
        this.elements = arrayOfNulls(initialCapacity)
    }

    constructor(elements: Array<E>) {
        this.elements = elements as Array<Any?>
        size += elements.size
    }

    fun push(element: E) {
        if (size == elements.size) {
            val newArray = arrayOfNulls<Any>(size + if (size < minCapacityIncrement / 2)
                minCapacityIncrement
            else
                size shr 1)
            System.arraycopy(elements, 0, newArray, 0, size)
            elements = newArray
        }
        elements[size++] = element
    }

    fun pushAll(newElements: Array<E>) {
        val newSize = size + newElements.size
        if (elements.size < newSize) {
            // New sizing can be of any logic as per requirement
            val newArray = arrayOfNulls<Any>(newSize + minCapacityIncrement)
            System.arraycopy(elements, 0, newArray, 0, size)
            elements = newArray
        }
        System.arraycopy(newElements, 0, elements, size, newElements.size)
        size = newSize
    }

    fun pop(): E {
        if (size == 0) throw StackUnderflowException()
        val index = --size
        val obj = elements[index]
        elements[index] = null
        return obj as E
    }

    fun pop(count: Int) {
        if (size == 0 || size < count) throw StackUnderflowException()
        for (i in 0 until count) {
            elements[--size] = null
        }
    }

    fun peek() = try {
        elements[size - 1] as E
    } catch (e: IndexOutOfBoundsException) {
        throw StackUnderflowException();
    }

    fun isEmpty() = size == 0

    fun isFull() = size == elements.size

    override fun toString(): String {
        if (size == 0) return "[]"
        val length = size - 1
        val builder = StringBuilder(size * 16)
        builder.append('[')
        for (i in 0 until length) {
            builder.append(elements[i])
            builder.append(", ")
        }
        builder.append(elements[length])
        builder.append(']')
        return builder.toString()
    }
}

class StackUnderflowException : RuntimeException()

inline fun <reified T> stackOf(vararg elements: T) = Stack<T>(elements as Array<T>)
