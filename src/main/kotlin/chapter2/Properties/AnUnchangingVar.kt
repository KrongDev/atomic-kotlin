package io.geon.chapter2.Properties

class Sofa {
    val cover: String = "Love seat cover"
}

fun main() {
    var sofa = Sofa()
    // var이기에 재대입이 가능
    sofa = Sofa()
}