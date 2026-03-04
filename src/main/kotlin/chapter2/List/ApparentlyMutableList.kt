package io.geon.chapter2.List

import io.geon.atomictest.eq

fun main() {
    var list = listOf('X')
    list += 'Y'             // 불변 리스트를 가변 리스트처럼 보이게 할 수 있다.
    // listOf는 불변일텐데 변경이 가능하면 불변성은 위배하는 것 같다.
    list eq "[X, Y]"
}