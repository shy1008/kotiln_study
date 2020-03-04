package com.example.myapplication.kotlin

//16.Iterable

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //반복하는 방법
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    //반복하는 방법2
    for ((index, item) in a.withIndex()) {
        println("index:" + index + "value: " + item)
    }
    //반복하는 방법3
    a.forEach {
        println(it)
        println("이게뭐게")
    }
    a.forEach { item ->
        println(item)
    }
    a.forEachIndexed { index, item ->
        println("index : " + index + "value : " + item)
    }
    println(a.size)
    for (i in 0 until a.size) {
        // until은 마지막을 포함 하지 않는다.
        //0부터 8까지
        println(a.get(i))
    }
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()
    //반복하는방법8
    for (i in a.size - 1 downTo (0)) {
        println(a.get(i))
    }
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    for (i in 0..10) {
        println(i)
    }
    for (i in 0..a.size) {
        println(i)
    }
    //반복하는 방법 11 와일문
    var b: Int = 0
    var c: Int = 4
    while (b < c) {
        b++ //while문 정지
        println("b")
    }
    //반복하는 방법 12
    do {
        println("hello")
        d++
    } while (b < c)

}