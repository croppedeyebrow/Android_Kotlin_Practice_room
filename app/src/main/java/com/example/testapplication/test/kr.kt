package com.example.testapplication.test


    fun main() {
        // 변수 선언
        val name = "Kotlin"
        var count = 1

        // 반복문 예제
        for (i in 1..5) {
            println("$name count: $i")
        }

        // 함수 호출
        greet("World")
    }

    fun greet(name: String) {
        println("Hello, $name!")
    }

