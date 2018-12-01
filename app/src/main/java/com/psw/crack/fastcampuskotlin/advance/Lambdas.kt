package advance
import com.psw.crack.fastcampuskotlin.MainActivity
import com.psw.crack.fastcampuskotlin.TestClass

class LambdasTest(p : (String) -> Unit) : TestClass(p){
    override fun doTest() {
        fun AddFunc(i : Int) : Int {return i+100}
        fun MainActivity.Lambdas(){

            // 함수내 함수정의가 가능함
            fun funTest1(func : (Int, Int) -> Int  ){
                func(10, 10).let { 결과값 ->  WriteLn("결과값은 $결과값 입니다") }
            }

            fun funTest2(func : (Int, Int) -> Int  ){
                WriteLn ( func(10, 10).toString() )
            }

            fun funtTest3(func : (Int, Int) -> Int, a : Int, b : Int  ){
                WriteLn ( func(a, b).toString() )
            }

            fun funtTest4(func : (Int) -> Int ){
                WriteLn ( func(1).toString() )
            }

            // 가장 심플한 람다식 표현
            var pfunc = {a: Int, b: Int -> a + b}

            // 그냥함수변수는 TestFunc : (Int, Int) -> Int 형으로 표현가능하다.
            // C/C++ 에서 함수형변수 정의하는 것과 유사하다.
            // 함수처럼 사용함
            WriteLn( pfunc(10, 30 ).toString() )

            // 변수로 넘김
            funTest1( pfunc )
            funTest2{ n, n2 -> n + n2}
            funtTest3(
                { n, n2 -> n +n2 },
                100, 10
            )

            // 함수원형의 포인터를 대입시키는 편법
            var funParameter = {a : Int -> AddFunc(a)}
            funtTest4( funParameter )

            // 위의 코딩을 점점 더 단순화
            funtTest4( { a : Int -> AddFunc(a)} )
            funtTest4{ a : Int -> AddFunc(a)}
            funtTest4{ a  -> AddFunc(a) }

        }

    }
}


