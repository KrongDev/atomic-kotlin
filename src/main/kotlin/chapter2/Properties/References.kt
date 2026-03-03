package io.geon.chapter2.Properties

class Kitchen {
    var table: String = "Round table"
}

// Instance 주소가 같기에 출력되는 값도 같다.
fun main() {
    val kitchen1 = Kitchen()
    val kitchen2 = kitchen1
    println("kitchen1: ${kitchen1.table}")
    println("kitchen2: ${kitchen2.table}")
    kitchen1.table = "Square table"
    println("kitchen1: ${kitchen1.table}")
    println("kitchen2: ${kitchen2.table}")
}