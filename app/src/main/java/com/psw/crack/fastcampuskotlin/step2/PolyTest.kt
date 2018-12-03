package com.psw.crack.fastcampuskotlin.step2

import com.psw.crack.fastcampuskotlin.TestClass

class PolyTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var obj1 = baseClass()
        obj1.f1()
        var obj2 = childClass()
        obj2.f1()
        obj2.f2()
        obj2.f2("문자열 파라메터")
        obj2.f2("문자열 파라메터", 100)
    }

    open class baseClass{
        // 상속받은 클래스에서 override 하려면 부모클래스에서 open으로 정의.
        open var name = "base"
        open fun f1() = println(this.toString())
        // 외부사용금지 .찍고 메소드 사용못함.
        private fun onlyMyFunc() = println("클래스내부에서만 사용")
        constructor(){
            onlyMyFunc()
        }
    }
    class childClass : baseClass(){
        override var name = ""
        override fun f1() = println(this.toString() + " 재정의함.")
        fun f2() = println("f2")
        // overloding
        fun f2(s : String ) = println("f2:$s ")
        fun f2(s : String, num : Int ) = println("f2: $s, $num ")
    }
}