package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass

class ConditionTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        ifTest(17.0f)
        loopTest(8)
        caseTest(3)

        // 비교의 결과를 대입
        var a = "ABCDE"
        val result = when (a){
            is String -> {true}
            else -> {false}
        }
        println(result)

        // 리턴되는 형이 달라도 처리가능하다.
        println ( if("AAA".length > 3) true else "짧아요"  )
    }

    fun caseTest(o : Any?) {
        when(o){
            "Test"      -> {println ("문자:" + o )}
            is Float    -> {println ("Float:" +  o)}
            in (0 .. 9) -> {println ("0-10까지 숫자: $o ")}
            else        -> {println ("???")}
        }
    }

    fun loopTest(count : Int) {
        // 반복문 for: in과 (시작..끝)으로 반복가능
        for (i in (0..count)  ){
            println ("i -> " + i )
        }

        // 반복문 while: while(조건){}
        var i : Int = 0;
        while(i < count){ i++; println ("$i 입니다.") }
    }

    fun ifTest( a : Any?) {
        if (a == "Test"){              // ==를 이용한 값비교
            println ( a )

        } else if( a is Float )  {     // is를 이용한 형비교
            println ( "Float" )

        } else if (a in (0..9) ){      // in을 이용한 범위비교
            println ("0-10까지 숫자: $a ")

        } else if (a == null ){
            println ("null!")
        }
    }
}