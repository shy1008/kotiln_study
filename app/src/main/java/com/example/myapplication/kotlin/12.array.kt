package com.example.myapplication.kotlin

//12.배열


fun main(array: Array<String>) {
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    var group2 = arrayOf(1,2,3.5,"hello")

    //Index
    //배열 꺼내기
    val test1 = group1.get(0)


    val test2 = group2[2]
    //컨트롤 + p
    //배열값 바꾸기
    group1.set(0,100)
    group2[0] = 200





}