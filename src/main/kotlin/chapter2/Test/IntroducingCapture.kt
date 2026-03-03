package io.geon.chapter2.Test

import io.geon.atomictest.capture

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}