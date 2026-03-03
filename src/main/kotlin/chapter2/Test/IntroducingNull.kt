package io.geon.chapter2.Test

import io.geon.atomictest.eq

fun main() {
    "1$".toIntOrNull() eq null
}