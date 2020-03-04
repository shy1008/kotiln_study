package com.example.myapplication.kotlin

//10 제어흐름

//when

fun main(array: Array<String>) {
    val value: Int = 3

    when (value) {
        1 ->{
            println("value 1")
        }
        2 ->{
            println("value 2")
        }
        3 ->{
            println("value 3")
        }
        else ->{
            println("not value ")
        }
    }

    val  value2 = when(value){
        1->10
        2->20
        3->30
        else->100
    }

    println(value2)

}