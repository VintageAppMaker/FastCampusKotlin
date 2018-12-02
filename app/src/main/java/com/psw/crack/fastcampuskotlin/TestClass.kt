package com.psw.crack.fastcampuskotlin

open class TestClass(pFunc : (Any) -> Unit){
    // println을 대치하는 프로퍼티
    var println : (Any) -> Unit = pFunc
    // 테스트할 코드 
    open fun doTest() {}
}