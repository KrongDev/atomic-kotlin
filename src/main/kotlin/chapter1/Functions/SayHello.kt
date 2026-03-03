package io.geon.chapter1.Functions

fun sayHello() {
    println("Hello")
}

// Unit: Java의 Void와 흡사하며, 의미있는 결과를 제공하지 않는 함수
// 붙일지 말지 자유
fun sayGoodbye(): Unit {
    println("Goodbye")
}

fun main() {
    sayHello()
    sayGoodbye()
}