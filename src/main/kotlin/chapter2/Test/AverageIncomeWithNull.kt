package io.geon.chapter2.Test

import io.geon.atomictest.eq

fun averageIncome2(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main() {
    averageIncome2(3300, 3) eq 1100
    averageIncome2(3300, 0) eq null
}