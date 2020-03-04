package com.example.myapplication.kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(5)
    println(a)
    a.add(0, 100)
    a.set(0, 200)
    a.removeAt(0)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    b.remove(2)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    c.replace("two", 2)
    println(c.keys)
    println(c.values)
    c.clear()

}