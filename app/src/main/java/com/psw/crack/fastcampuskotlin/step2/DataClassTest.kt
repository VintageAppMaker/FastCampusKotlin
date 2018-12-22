package com.psw.crack.fastcampuskotlin.step2

import com.psw.crack.fastcampuskotlin.TestClass

class DataClassTest( p: (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        // 1. 일반 클래스로 데이터값을 할당해보기
        var a = A()
        a.power = 3
        a.name   = "snake"

        println (a)

        // 2. data class 사용해보기
        var d0 = DataA("AAA", 3)
        var d  = DataA(nLevel = 3)

        println (d0)
        println (d)

        // 3. data class에서 body 적용해보기
        var d3 = DataA(nLevel = 11)
        d3.job = "archer"
        println (d3)

        // 4. data class에서 copy 메소드
        var d4 = d3.copy(name = "동작구디아블로")
        println (d4)

        // 5. data class에서 destruction
        var (name) = d4
        println (name)

        var (name2, power) = d4
        println ("$name2 $power ")

    }

    class A {
        var name   : String = ""
        var power  : Int    = 0
    }

    data class DataA(var name : String ="이름없음", var nLevel : Int){
        var job : String = ""
        operator fun plus (d : DataA){ this.nLevel + d.nLevel}
    }    
    
}
