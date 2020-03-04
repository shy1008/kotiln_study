package com.example.myapplication.kotlin

fun main(array: Array<String>){

    //값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야 한다.


    //is는 타입을 확인한다

    val value4:Int = 10
    when (value4){
        is Int -> println("value4 is int")
        else -> println("value4 is not int")
    }

    //in ..은 그 사이를 뜻하고 양쪽 둘다 포함함.
    val value5:Int = 60
    when(value5){
        in 60..70 ->{
            println("60-70")
        }
        in  70..80 ->{
            println()
        }
    }


}