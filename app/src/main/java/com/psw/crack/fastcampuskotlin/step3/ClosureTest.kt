package com.psw.crack.fastcampuskotlin.step3

import com.psw.crack.fastcampuskotlin.TestClass
class ClosureTest( p : (Any) -> Unit ) : TestClass(p){
    override fun doTest() {

        var fn = Closure1(10)
        println( fn(10) )
        println( fn(10) )
        println( fn(10) )

        var decByOne = Closure2({ num -> num - 1 })
        println ( decByOne() )
        println ( decByOne() )

        fun Add(num : Int) = num + 10
        var addByTen = Closure2(::Add)
        println ( addByTen() )
        println ( addByTen() )

    }

    // 자바스크립트에서 볼 수 있는 간단한 클로져
    // 객체지향처럼 함수 내의 변수들을 계속 유지할 수 있다.
    fun Closure1(num : Int ) : (Int) -> Int {
        var sum: Int = num
        return fun (num2 : Int) : Int{
            sum = sum + num2
            return sum
        };
    }

    // 람다로 함수를 받음
    fun Closure2 (pFunc : (Int) -> Int) : () -> Int{
        var result : Int = 0
        return {
            result = pFunc(result)
            result
        }
    }

}