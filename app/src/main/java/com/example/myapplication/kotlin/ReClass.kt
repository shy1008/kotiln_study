package com.example.myapplication.kotlin

//18. Class

//OOP -> object oriented programing


fun main(array: Array<String>) {
    //설명서를 통해서 실체로 만드는것 인스턴스화, 인스턴스 : 객체
//     Carr("v8 weda","big")

    //우리가 만든 설명서는 자료형이 될수 있다.

    val bank : bank10 = bank10("so","1996-10-08",3000)
    println(bank.chcekBalance())
    println(bank.outmoney(3000))

}

//-----------------------------------------------------------------------------
class Car1028(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

class Car1023 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class bank10(var name: String, var birth: String, var blance: Int) {
    fun chcekBalance(): Int {
        return blance
    }

    fun outmoney(number: Int) {
        if (blance >= number){
            println("출금가능")
        }else{
            println("출금불가")
        }
    }
}

