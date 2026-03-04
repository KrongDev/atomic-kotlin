package io.geon.chapter2.List

import io.geon.atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "[99 3 5 7 11 13"
}