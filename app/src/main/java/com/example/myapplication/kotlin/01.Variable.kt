package com.example.myapplication.kotlin

//01.Variable ->변수
//마음대로 원하는것을 넣을수있다 ->Variable ,let같은존재
//한번 넣으면 바꿀수 없다 ->Value ,const같은존재


//변수 선언하는 방법
//var/val 변수명 = 값(넣고싶은것)
//Variable/Value


var num = 10
var hello = "hello"
var point = 3.4

val fix = 20


fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Good"
    point = 10.4

    println(num)
    println(hello)
    println(point)


}