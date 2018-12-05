package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass

class PropertiesTest ( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        passwd = "1234567867657572313"
        println (passwd)

        // 내가만든 클래스에 확장 프로퍼티 추가
        val empty = EmptyClass()
        empty.newProp = "안녕"
        empty.newProp = "반가와요"
        empty.newProp = "새로운 클래스"
        println (empty.newProp)

        // mutableList에 확장 프로퍼티 추가
        // Queue와 흡사한 Log처리
        val mLog = mutableListOf <String>("success:100", "pass:203", "fail:001")
        println(mLog)

        mLog.firstHead = "success:100"
        mLog.firstHead = "shutdown:-1"
        mLog.forEach { println(">${it}"); }
        println(mLog.firstHead)
    }

    var passwd : String = ""
        get(){
            if(field.length > 5) {
                field = "길이를 초과했음"
            }
            return field
        }
        set(s : String ){
            println ("\"${s}\"을 저장함")
            field = s
        }

    class EmptyClass {
        var message : String = ""
    }

    var EmptyClass?.newProp : String
        get(){
            return this!!.message
        }
        set(value) { this!!.message = value + "-" + this!!.message}

    // MutableList에 firstHead 프로퍼티 추가
    var MutableList<String>?.firstHead : String
        get() {
            return this!!.get(0)
        }
        set(value) {
            this!!.add(0, value)
        }
}