package com.example.myapplication.kotlin

fun main(array: Array<String>) {

    val calculator10:calculator10 = calculator10()

    println(calculator10.divide10(10,1,2,1))
    println(calculator10.minus10(2,4,5))

}

class calculator10 {

    fun plus10(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus10(vararg numbers: Int):Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size){
            result = result - numbers[i]
        }
        return result
    }

    fun multiply10(vararg  numbers: Int): Int {
        var result : Int = 1
        numbers.forEach {
            if (it !=0){
                result = result + it
            }
        }
        return result
    }

    fun divide10(vararg numbers:Int) :Int{
        var result:Int = numbers[0]
        numbers.forEachIndexed { index, i ->
            if (i != 0 && index != 0){
                result /= i
            }
        }
        return result
    }
}

