package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass
class ExceptionTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        // java와 달리 try catch가 필수가 아니다.
        var divNumber = 0
        try{
            707 / divNumber
        } catch(e: Exception){
            println(e)
        } finally {
            println("Last")
        }

        // 1. Kotlin Style (예외처리는 소스코드에서 로직으로! 아니면 종료)
        //var zerodivided = 707 / divNumber
        //println(zerodivided)

        // null checking은 까다로움
        var addNumber : Int? = null

        // 에러
        // var sum = addNumber + 100

        // 처리방법 1
        if ( addNumber != null) {
            var sum = addNumber + 100
        }

        // 처리방법 2 (종료)
        //var sum = addNumber!! + 100

        // 처리방법 3(실행안됨)
        var sum = addNumber?.let {
            it + 100
        }
    }
}