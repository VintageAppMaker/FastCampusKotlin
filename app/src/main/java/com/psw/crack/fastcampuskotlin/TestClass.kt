package com.psw.crack.fastcampuskotlin

open class TestClass(pFunc : (Any) -> Unit){
    // println을 대치하는 함수형 변수
    var println : (Any) -> Unit = pFunc
    // 테스트 코드
    open fun doTest() {}
}