fun main() {
    // 1. 기본 함수 정의와 호출
    println("Sum: ${sum(5, 3)}")

    // 2. 반환 타입 추론
    println("Multiply: ${multiply(4, 7)}")

    // 3. 기본 매개변수
    greet()
    greet("Alice")

    // 4. 네임드 매개변수
    createUser(age = 30, name = "Bob")

    // 5. 가변 인자
    println("Sum of numbers: ${sumAll(1, 2, 3, 4, 5)}")

    // 6. 지역 함수
    outerFunction()

    // 7. 확장 함수
    val str = "Hello"
    println("Doubled string: ${str.double()}")

    // 8. 중위 함수
    println("Infix function result: ${5 plus 3}")

    // 9. 함수 타입
    val operation: (Int, Int) -> Int = ::sum
    println("Function type result: ${operation(10, 20)}")

    // 10. 꼬리 재귀 함수
    println("Factorial of 5: ${factorial(5)}")
}



// 1. 기본 함수
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 2. 반환 타입 추론
fun multiply(a: Int, b: Int) = a * b

// 3. 기본 매개변수
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

// 4. 네임드 매개변수
fun createUser(name: String, age: Int) {
    println("Created user: $name, age: $age")
}

// 5. 가변 인자
fun sumAll(vararg numbers: Int): Int {
    return numbers.sum()
}

// 6. 지역 함수
fun outerFunction() {
    fun innerFunction() {
        println("This is an inner function")
    }
    innerFunction()
}

// 7. 확장 함수
fun String.double(): String {
    return this.repeat(2)
}

// 8. 중위 함수
infix fun Int.plus(other: Int): Int {
    return this + other
}

// 9. 함수 타입 (이미 sum 함수로 정의됨)

// 10. 꼬리 재귀 함수
tailrec fun factorial(n: Int, accumulator: Int = 1): Int {
    return when (n) {
        0, 1 -> accumulator
        else -> factorial(n - 1, n * accumulator)
    }
}