package io.geon.chapter2.Testing

import io.geon.atomictest.eq

fun main() {
    calculateBMI2(160, 68) eq "Normal weight"
}

fun calculateBMI2(weight: Int, height: Int): String {
    val bmi = weight / (height * height) * 703.07
    // 얘가 0임 왜? Int로 연산이 되었기 때문?
    println(bmi)
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}
