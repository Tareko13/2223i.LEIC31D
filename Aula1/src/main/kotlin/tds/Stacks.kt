package tds

class MutableStack<T> {
    val storage = arrayListOf<T>()
    fun push(elem: T) { storage.add(elem) }
    fun pop(): T = storage.removeAt(storage.size-1)
    fun isEmpty(): Boolean = storage.size==0
    fun top(): T = storage[storage.size-1]
}