package io.geon.chapter2.List

import io.geon.atomictest.capture

fun main() {
    val ints = listOf(1,2,3)
    capture {
        ints[3]
    } contains
            listOf("ArrayIndexOutOfBoundsException")
}