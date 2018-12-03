package com.psw.crack.fastcampuskotlin.step2

import com.psw.crack.fastcampuskotlin.TestClass

class DataClassTest( p: (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var data1 = BasicInfo("김씨", 30)
        var data2 = DetailInfo(name = "박씨",
            dummy = DummyClass().apply { reserved = "확장정보" })

        var (name1, age1) = data1
        println ("$name1 : $age1")
        var (name2, age2, dummy2) = data2
        println ("$name2 : ${dummy2?.reserved}")

        // 이 부분이 제일 유용함
        var data4 = data2.copy(name = "신씨")
        println ("${data4.toString()}")

    }

    class DummyClass{
        var reserved : String? = null
    }

    data class BasicInfo(var name : String, var age : Int)
    data class DetailInfo(var name : String, var age : Int = 40, var dummy :DummyClass? = null )
}