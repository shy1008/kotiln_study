package com.example.myapplication.kotlin

fun main(array: Array<String>){

    val a:Int ? = null
    val b:Int = 10
    val c:Int = 100

    if (a == null){
        println("a is null")
    }else{
        println("a is not null")
    }

    //엘비스 연산자
    val number: Int? = null
    val number2 = number ?: 10
    println(number2)


}