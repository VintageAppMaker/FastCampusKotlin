package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass
class AnyTypeTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var everybody : Any

        // 1. 마지막 외에 회색인 이유는?
        everybody = 1111
        everybody = "문자열테스트"
        everybody = 221.01010
        everybody = 12.00f

        // is와 !(not) 연산자로 어떤 데이터 형인지 채크가 가능함.
        if(everybody !is String) {

            if (everybody is Float) {
                println("float입니다")
            }
        }

        // 2. null은 어떻게 해야할까?
        // everybody = null

        // 3. 값을 비교하기
        println( everybody == 12.00f )
        println( everybody.equals(12.00f) )

    }


}
