package com.example.myapplication.kotlin

//14.Collection
//-> list, set, map

fun main(args: Array<String>) {

    // Immutable collections(변경불가)
    //List
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    //Set
    // 집합같은의미, 중복허용하지않음
    // 순서가 없다!! index가 없어
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }

    //Map key, value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("two"))

    //Mutable collections(변경가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two",2)


}