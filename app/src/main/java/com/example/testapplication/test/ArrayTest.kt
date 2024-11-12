package com.example.testapplication.test

fun main() {
    // 1. arrayOf() 함수를 사용한 배열 생성
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("numbers: ${numbers.contentToString()}")

    println("--------")

    // 2. Array 생성자를 사용한 배열 생성
    val squareNumbers = Array(5) { i -> i * i }
    println("squareNumbers: ${squareNumbers.contentToString()}")

    println("--------")

    // 3. 특정 타입의 배열 생성
    val intArray = IntArray(5) { it * 2 }
    println("intArray: ${intArray.contentToString()}")

    println("--------")

    // 4. 문자 배열 생성
    val charArray = CharArray(3) { 'a' + it }
    println("charArray: ${charArray.contentToString()}")

    println("--------")

    // 5. 2차원 배열 생성 및 출력
    val matrix = Array(3) { IntArray(3) { it } }
    println("matrix:")
    for (row in matrix) {
        println(row.contentToString())
    }

    println("--------")

    // 6. 배열 요소 접근 및 수정
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    println("Original fruits: ${fruits.contentToString()}")
    fruits[1] = "Blueberry"
    println("Modified fruits: ${fruits.contentToString()}")


    println("--------")


    // 7. 배열 순회 및 출력
    println("Fruits:")
    for ((index, fruit) in fruits.withIndex()) {
        println("Index $index: $fruit")
    }

    println("--------")

    // 8. 배열 함수 사용
    println("Sum of numbers: ${numbers.sum()}")
    println("Average of numbers: ${numbers.average()}")
    println("Max of numbers: ${numbers.max()}")
    println("Min of numbers: ${numbers.min()}")
}