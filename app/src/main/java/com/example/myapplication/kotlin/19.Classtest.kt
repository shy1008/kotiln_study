package com.example.myapplication.kotlin

fun main(array: Array<String>){
    //1번문제
    var calculator:calculator = calculator(5,10)
    println(calculator.sum(3,4))
    calculator.min(2,5)
    calculator.mul(3,4)
    calculator.div(3,4)

    var bank:bank = bank()
    bank.account("소홍렬",961008)
    bank.deposit()
    bank.money()
    bank.withdraw()

    var tv:Tv = Tv()
    tv.control(5)
    tv.onoff("on")


}


//1.사칙연산 수행 클래스
class calculator{
    var first: Int
    var last:Int

    constructor(first:Int, last:Int){
        this.first = first
        this.last = last
    }
    init {
        println("1번문제 시작")
    }
    fun sum(first:Int, last:Int){
        println(first+last)
    }
    fun min(first:Int, last:Int){
        println(first-last)
    }
    fun mul(first:Int, last:Int){
        println(first*last)
    }
    fun div(first:Int, last:Int){
        println(first/last)
    }

}

//여러자리수
class calcul2(){
}
//리턴이 cal3활용
class cal3{

}

//2. 은행계좌 만들기
//- 계좌생성기능(이름,생년월일)
//- 잔고를 확인 하는 기능
//- 출금 기능
//- 예금 기능


class bank{
    init {
        println("2번문제 시작")
    }
    fun account(name:String, birth:Int){
        println(name+"님"+birth+"주민번호 앞 6자리 확인되었고 계좌생성합니다.")
    }
    fun money(){
        println("현재 잔액 0원 입니다.")
    }
    fun withdraw(){
        println("출금하시겠습니까")
    }
    fun deposit(){
        println("예금하시겠습니까")
    }
}

//3.TV클래스
//-on/off 기능
//-채널을 돌리는 기능
//초기 채널은 (S사 m사 k사 3개)

class Tv{
    fun onoff(state:String) {
        if (state == "on"){
            println("tv on")
        }else{
            println("tv off")
        }
    }

    //파라미터가 int형이면 println에 +기능이 먹히지 않는다.
    fun control(num:Int){
        var number = num
        println("$number 번 채널로 이동합니다.")
    }

    init {
        println("3번문제 시작"+"\n"+"현재 채널은 S사 입니다.")
    }
}

//파라미터 리스트로 
//처음 블린값 펄스 = !
//foreachIndexed
//set함수 값의 할당 field 중요
