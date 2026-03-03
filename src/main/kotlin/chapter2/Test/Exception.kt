package io.geon.chapter2.Test

// NumberFormatException <- RuntimeException
fun erroneousCode() {
    val i = "1$".toInt()
}

fun main() {
    erroneousCode()
}