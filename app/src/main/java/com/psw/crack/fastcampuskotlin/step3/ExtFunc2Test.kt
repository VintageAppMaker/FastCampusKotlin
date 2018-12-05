package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass
class ExtFunc2Test( p : (Any) -> Unit ) : TestClass(p){
    override fun doTest() {
        // 이미 만들어진 객체에 함수를 추가할 수 있다.
        fun String?.myFunction(s : String, n : Int ) : String?{
            var sTooManyTalk = "$this : added \n"
            (1.. n).forEach { sTooManyTalk += "${s}\n" }
            return sTooManyTalk
        }

        println ( "Hi".myFunction("Hi", 10) )

        // apply와 다른 점은 분명히 있다.
        var obj = ani {
            crying()
            eat()
            nCount++
        }

        println("증가된 숫자는 ${obj.nCount} 입니다.");
        obj.setOnEvent(3, "울어", {
                nCount ->
            println ("${nCount}번 울겠습니다.")
            (1..nCount).map {crying()}
        })

        obj.setOnEvent(2, "먹어", {
                nCount ->
            println ("${nCount}번 먹겠습니다.")
            (1..nCount).map {eat()}
        })

    }

    // closure 활용
    fun ani(extFunc: Animal.() -> Unit) : Animal{
        var ani = Animal()

        // 확장함수가 실행되어야 한다.
        ani.extFunc()
        return ani
    }

    class Animal{
        open var nCount = 0
        fun crying() = println("$this>> 아흥")
        fun eat() = println("$this>> 우걱우걱")
        open fun setOnEvent(nCount : Int, message : String, extFunc: Animal.(Int) -> Unit) : Animal{
            when (message){
                "울어" -> {extFunc(nCount)}
                "먹어" -> {var n = if (nCount < 3) 3 else nCount; extFunc(n)}
                else -> { println("알수없는 메시지: ${ message } 입니다.")}
            }
            return this
        }
    }
}