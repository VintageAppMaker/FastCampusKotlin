package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass

class CurryngTest( p : (Any)-> Unit) : TestClass(p){
    override fun doTest() {
        val alba
                : (Double)->(Int )->(String)->String = ::WorkForMoney
        val normal_people: (Int)->(String)->String
                = WorkForMoney(25000.0)
        val developer : (Int)->(String)->String
                = WorkForMoney(35000.23)
        val HighIncome : (String)->String
                = WorkForMoney(45000.23)(8 * 5 * 5 )
        listOf <()->String>(
            {alba(7800.0)(8 * 5 * 4)("알바")},
            {normal_people(8 * 5 * 4)("일반인")},
            {developer(8 * 5 * 4)("개발자")},
            {HighIncome("나님만이 세상을 구한다")},
            {"퇴직자의 희망사항:" + WorkForMoney(30000.0)(8 * 5 * 4)("뭐라고 불리던")}
        ).map { it().let { 결과 -> println ( 결과 )} }
    }

    // currying의 그나마 존재이유
    // seed값을 지정한 계산함수 생성하기
    fun WorkForMoney(moneyByHour : Double) :
        (Int) ->(String) -> String
            = fun (time : Int)
            = fun (job : String ) : String {
            return if( time > 8 * 5 * 4)
                "[${job}]님은 돈이 문제가 아님. 인생이 손해임. 약값이 더 들어감"
            else
                "[${job}]입니다. ${moneyByHour * time}만큼 받습니다. "
        }
}