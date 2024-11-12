package com.example.testapplication.test


fun main() {
    var a: Int = 54321
    var b: Long = a.toLong() //int를 long형으로 변환
    println(a)
    println(b)

    typeCheck(a)
    typeCheck(b)

}

fun typeCheck(obj:Any):Int?{ //Any는 모든 타입의 부모격이다
    //is 키워드는 객체 타입을 체크합니다.
    if(obj is String){
        println("String 입니다.")
    }else if(obj is Int){
        println("Int 입니다.")
    }else {
        println("그 이외의 타입입니다.")
    }

    return null
}