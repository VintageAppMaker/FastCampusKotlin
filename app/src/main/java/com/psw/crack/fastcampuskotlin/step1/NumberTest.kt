package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass

class NumberTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        // 숫자형 DataType 크기 순으로 선언
        var doubleV : Double = 110.1111
        var floatV  : Float  = 110.1f
        var longV   : Long   = 110
        var intV    : Int    = 20
        var shortV  : Short  = 30
        var byteV   : Byte   = 10

        // 출력해보기
        println (doubleV)
        println (floatV)
        println (intV)

        // 크기변환 후, 대입 : 캐스팅
        // to대입할크기() 메소드를 사용한다.
        // ** as로 형변환은 기본형에서는 안된다. **
        doubleV   = intV.toDouble()

        // 회색인 이유는?
        intV = doubleV.toInt()

        // 문자열로 변환
        println ( byteV.toString() )

        // 문자를 숫자로 변환
        val sum = "123".toLong() + 10
    }
}