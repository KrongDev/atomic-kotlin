package io.geon.chapter1.Functions

// expression body: 식의 형태를 띄는 경우
fun multiplyByThree(x: Int): Int = x * 3

// block body: {}에 감싸진 경우
fun main() {
    val result = multiplyByThree(5)
    println(result)
}