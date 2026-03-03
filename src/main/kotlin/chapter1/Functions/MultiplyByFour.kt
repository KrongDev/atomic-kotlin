package io.geon.chapter1.Functions


// block body일 때 반환 타입을 명시하지 않으면 무조건 Unit type으로 인식
fun multiplyByFour(x: Int) = x * 4

fun main() {
    val result = multiplyByFour(5)
    println(result)
}