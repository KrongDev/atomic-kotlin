package io.geon.chapter2.Visibility


class Counter(var start: Int) {
    fun increment() {
        start += 1
    }
    override fun toString(): String = start.toString()
}

class CounterHolder(counter: Counter) {
    private val ctr = counter
    override fun toString() =
        "CounterHolder: $ctr"
}

// 한 객체에 대해 참조를 여러개 유지하는 경우를 에일리어싱(aliasing) 이라한다.
fun main() {
    val c = Counter(11)
    val ch = CounterHolder(c)
    println(ch)
    c.increment()
    println(ch)
    val ch2 = CounterHolder(Counter(9))
    println(ch2)
}