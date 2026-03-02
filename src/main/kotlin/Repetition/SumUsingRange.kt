package io.geon.Repetition

fun main() {
    var sum = 0
    for(n in 10 .. 100) {
        println(n)
        sum += n
    }
    println("sum = $sum")
}