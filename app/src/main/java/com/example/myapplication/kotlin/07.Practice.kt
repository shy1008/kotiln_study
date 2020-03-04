package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    var a = 3
    var b = 3
    var c = 5
    var d = 10

    var x = a == b
    var y = a != b

    var test = x && y
    var test2 = x || y


    println(x)
    println(y)

    println(test == test)
    println(test2)
    println(!test2)


}