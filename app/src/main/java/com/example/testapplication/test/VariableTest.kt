package com.example.testapplication.test

fun main() {
    var a: Int = 123 //코틀린은 값 초기화 필수!
    println(a)
    println(main2())
}

fun main2() {
    var b: Int
    b = 123 //이렇게 초기화해도 된다
    println(b)
}