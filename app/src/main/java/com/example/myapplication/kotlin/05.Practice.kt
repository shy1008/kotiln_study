package com.example.myapplication.kotlin


fun plusThree(first: Int, second: Int, thrid: Int): Int {
//    val result = first + second + thrid
//    return result
    return first + second + thrid
}

fun minusThree(first: Int, second: Int, thrid: Int) = first - second - thrid

fun multiplyThree(first: Int = 1, second: Int = 1, thrid: Int = 1): Int {
    return first * second * thrid
}

//내부함수

fun  showMyPlus(first: Int, second: Int): Int {
    fun  plus(first: Int, second: Int): Int{
        return  first + second
    }

    return  plus(first,second)
}



fun main(array: Array<String>) {
//    println(plusThree(2, 3, 4))

    val result = plusThree(1,2,3)
    println(result)


}