package com.psw.crack.fastcampuskotlin.step1

import com.psw.crack.fastcampuskotlin.TestClass
class CollectionsTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        // 읽기전용 -  list. 데이터형을 마구 섞어도 된다.
        val lst = listOf(1, "A", 12.00f, false, true)
        for (i in 0 .. lst.size - 1){
            println ( lst.get(i).toString() )
        }

        println(">")

        // 수정가능 - List. 데이터형을 미리 정해야 하는 듯.
        var lstEditable = mutableListOf<String>()

        // add 메소드로 추가
        lstEditable.add("A")
        lstEditable.add("B")
        lstEditable.add("C")
        lstEditable.add("D")

        for(s in lstEditable){
            println(s)
        }

        println(">")

        // remove 메소드로 삭제
        lstEditable.removeAt(0);
        for(s in lstEditable){
            println(s)
        }

        println(">")

        // Map: java보다 불편한 듯.
        var m = hashMapOf("A" to 1, "B" to 2)
        println(m["A"])
    }
}
