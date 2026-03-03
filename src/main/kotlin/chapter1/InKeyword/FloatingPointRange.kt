package io.geon.chapter1.InKeyword

fun inFloatRange(n: Double) {
    val r = 1.0..10.0
    println("$n is $r? ${n in r}")
}

// 반열람 범위인 ..<와 같은 문법이 코틀린 1.8부터 허용
fun main() {
    inFloatRange(0.999999)
    inFloatRange(5.0)
    inFloatRange(10.0)
    inFloatRange(10.0000001)
}