package io.geon.Repetition

fun main() {
    val s = "abc"
    for(i in 0..s.lastIndex){
        // 문자에 숫자를 더하면 새로운 문자를 얻을 수 있다.
        print(s[i] + 1)
    }
}