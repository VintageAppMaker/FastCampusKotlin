package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass
class LabelTest(p : (Any) -> Unit): TestClass(p){
    override fun doTest() {
        ExitLoop();
        println(lambdaReturn())

        // 함수형 스타일의 활용
        (0..10).forEach {  if (it > 3) return@forEach else println(it) }
    }

    // @레이블 지정 후,  break@레이블로 나감
    // 대부분의 언어에서 지원하는 goto문과 유사함.
    fun ExitLoop() {
        HereToExit@ for(i in 0 .. 2){
            for (j in  0.. 10){
                if (j == 5) break@HereToExit;
                println("i->$i, j->$j")
            }
            println("j loop end");
        }
        println("i loop end");
    }

    // 이름없는 함수(람다식)의 리턴
    var lambdaReturn = Exit@{
        if(true){
            return@Exit 3
        }
        1000
    }

}