package io.geon.Functions

/**
 * placeholder: 파라미터를 넣을 장소
 * argument: 인자
 * signature: 메소드 이름, 파라미터, 반환 타입
 */
fun multiplyByTwo(x: Int): Int {
    // println(str: String): standard library function
    println("Inside multiplyByTwo method")
    return x * 2
}

fun main() {
    val r = multiplyByTwo(5)
    println(r)
}