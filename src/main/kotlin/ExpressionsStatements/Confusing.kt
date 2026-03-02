package io.geon.ExpressionsStatements

// 권장 안하는 패턴
fun main() {
    var i = 1
    println(i++ + ++i)
    println(i++ + 10)
    println(20 * ++i)
}