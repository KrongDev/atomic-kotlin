package io.geon.Functions

fun oneOrTheOther(exp: Boolean): String =
    if(exp) "true" else "false"

fun main() {
    val b = 1
    println(oneOrTheOther(b < 3))
    println(oneOrTheOther(b >= 3))
}