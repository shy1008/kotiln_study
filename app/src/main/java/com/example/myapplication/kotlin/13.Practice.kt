package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
//    println(number)

    array.set(0, 100)
    val number2 = array.get(0)
//    println(number2)

//    array.set(100, 100)

    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 't') //char -> '', string ->""
    val a3 = doubleArrayOf(1.2)
    val a4 = booleanArrayOf(true, false, true)
//array만드는 방법 ->lambda
    var a5 = Array(10, { 0 })
    var a6 = Array(5,{1;2;3;4;5})


    val array2 = arrayOf<Int>(1, 2, 3, 4, 5)
    var a8 = Array(9,{ arr(3)})

    println(a8.get(2))
//    var a7 = a6.get(0)
//    println(a7)

}

fun arr(num:Int){
    val  arr2 = mutableListOf<Int>()
    for (i in 1..9){
        arr2.add(i)
    }
}
