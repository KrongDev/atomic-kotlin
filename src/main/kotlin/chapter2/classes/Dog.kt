package io.geon.chapter2.classes

class Dog {
    fun bark() = "yip!"
}

fun main() {
    val dog = Dog()
    println(dog.bark())
}