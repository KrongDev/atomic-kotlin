package io.geon.chapter2.List

import io.geon.atomictest.eq

fun getList(): List<Int> {
    return mutableListOf(1,2,3)
}

fun main() {
    val list = getList()

    list eq listOf(1,2,3)
}