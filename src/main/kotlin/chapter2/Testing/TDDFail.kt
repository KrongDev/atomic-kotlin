package io.geon.chapter2.Testing

import io.geon.atomictest.eq

fun main() {
    calculateBMI(160, 68) eq "Normal weight"
}

fun calculateBMI(weight: Int, height: Int) =
    "Normal weight"