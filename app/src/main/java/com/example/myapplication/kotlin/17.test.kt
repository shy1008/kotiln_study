package com.example.myapplication.kotlin

//1번문제


fun first() {
    var firstList = mutableListOf<Int>()
    for (item in 1..9) {
        firstList.add(item)
    }

    val t = true
    val f = false
    var secondList = mutableListOf<Boolean>()
    for (item in firstList) {
        if (item % 2 == 0) {
            secondList.add(t)
        } else {
            secondList.add(f)
        }
    }
    println(firstList)
    println(secondList)
}

fun second(int: Int) {
    var value: Int? = int
    when (value) {
        in 80..90 -> {
            println("A학점")
        }
        in 70..79 -> {
            println("B학점")
        }
        in 60..69 -> {
            println("C학점")
        }
        else -> {
            println("F학점")
        }
    }
}

fun third(int: Int) {

    if (int in 10..99) {
        var first = int / 10
        var last = int % 10
        println(first + last)
    } else {
        println("두자리 숫자만 입력하세요.")
    }
}

fun four() {

    for (i in 1..9){
        for (l in 1..9){
//            val mul = i * l
           println("$i * $l =${i * l}")
        }
        println()
    }
}


fun main(array: Array<String>) {
//    first()
//    second(50)
//    third(87)
    four()


}

