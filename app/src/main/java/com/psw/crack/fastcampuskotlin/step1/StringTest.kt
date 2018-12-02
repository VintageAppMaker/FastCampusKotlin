package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass
import java.util.*

class StringTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var sName = "박모씨 "

        // 1.문자열을 추가하는 것은 + 연산자로 가능함 <- Java와 동일
        println (sName + " - The Gamer")

        // 2. """ 이 안에 줄넘김 문자열이 들어갈 수 있다. """
        // Python에 이런 기능이 있다.
        var sLines = """
    1
    2
    3
    4
    5
    6
    7
    8
    9
    """
        println(sLines)

        // 3. 문자열 내의 포멧팅 방법
        // linux의 bash와 비슷함.

        var sForamatter = "$sName <-- sName의 값"
        println(sForamatter)

        // 4. linux bash와 비슷하니
        // ${}안에
        // 함수호출이나 수식처리도 가능함.
        var sBash = "${ "지금시각은  - " + Date()}" // Java class도 가져욜 수 있음.
        println(sBash)
    }
}