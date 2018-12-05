package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass
class MultiReturnTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        // 1. Extract
        val (v1, v2, v3 ) = listOf("Kotlin", 32, 123.0f)
        println ("${v1}, ${v2}, ${v3}")

        // 2 List 파티션으로 나누기
        val lst = (0..10).map { Student("name -${it}", (it % 3) + 1 ) }
        println (lst)
        val (l1, l2) = lst.partition { it.grade == 2 }
        println ("l1")
        l1.map { println (it) }
        println ("l2")
        l2.map { println (it) }

        // 3. 순위별로 가져오기
        val (n1, n2, n3) = (0..100).filter { it % 2 == 0 }.sortedByDescending { it }
        println (n1.toString() + ", " + n2.toString() + ", " + n3.toString())
    }

    data class Student (var name : String, var grade : Int)
}