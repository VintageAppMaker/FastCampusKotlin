package com.psw.crack.fastcampuskotlin

open class TestClass(pFunc : (String) -> Unit){
    var println : (String) -> Unit = pFunc
    open fun doTest() {}
}