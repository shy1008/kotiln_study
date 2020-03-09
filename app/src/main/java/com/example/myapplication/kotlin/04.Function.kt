package com.example.myapplication.kotlin

//04.Function
//  -함수
//      -어떤 input을 넣어주면 어떤 output 나오는것

//  함수 선언하는 방법
// fun 함수명( 변수명: 타입, 변수명:타입 ...) :반환형{
//      함수내용
//      return 반환값
// }

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    return result

}

//디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//반환 값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//간단하게 만드는 함수
fun plusShort(first: Int, second: Int) = first + second

//가변 인자를 갖는 함수 선언 방법
fun  plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number)
    }
}
fun main(array: Array<String>) {

    println(plus(5, 3))

    println()
    val result4 = plusFive(10, 20)

    printPlus(50, 20)

    plusMany(1,2,3,4)


}