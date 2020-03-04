package com.example.myapplication.kotlin

// 18.class

// OOP -> object oriented programing (객체지향 프로그래밍) ,절차지향x,함수지향x
//객체란  - 이름이 있는 모든것
//객체지향 프로그래밍 문제 해결방법 - 객체를 만들어 일을 시킨다
//객체를 만드는 방법 - 설명서가 있어야 한다.
fun main(array: Array<String>) {


    val number: Int = 10


    //클래스를 통해서 실체를 만드는 방법
    //인스턴스화 -> 인스턴스(객체)
    val bigCar = Car("v8 engine", "big")
    // 만든 클래스는 자료형이 된다.
    val bigCar1: Car = Car(engine = "v8 engine", body = "big")

    val runableCar2: RunableCar2 = RunableCar2("good engine", "long body")

    println(runableCar2.engine)
    runableCar2.body

}

// 클래스 만드는 방법
class Car(var engine: String, var body: String) {

}

// 클래스 만드는 방법2
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door

    }

}

//클래스 만드는 방법3 ->1번확장
class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

//클래스 만드는 방법4 ->2번확장
class Car2 {
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

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        //초기셋팅 할때 유용
    }

    fun run() {
        println("탑승")
    }

    fun drive() {
        println("달린다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지입니다.")
    }
}

//오버로딩
class TestClass() {
    // 이름이 같지만 받는 파라미터가 다른 함수
    fun test(a: Int) {
        println("up")
    }

    fun test(a: String) {
        println("down")
    }
}
























