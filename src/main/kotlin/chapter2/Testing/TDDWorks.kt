package io.geon.chapter2.Testing

import io.geon.atomictest.eq

fun main() {
    calculateBMI3(160.0, 68.0) eq "Normal weight"
}

fun calculateBMI3(weight: Double, height: Double): String {
    val bmi = weight / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
