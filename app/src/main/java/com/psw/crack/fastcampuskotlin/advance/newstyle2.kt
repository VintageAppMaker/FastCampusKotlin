package advance

import com.psw.crack.fastcampuskotlin.TestClass

class NewStyle2( p : (String) -> Unit ) : TestClass(p){
    override fun doTest() {
        var good : String? = null
        good.let { "오픈소스의 장점은" }
            .let  {println(it); listOf("필요한 기능을 제공한다", "다양하게 고를 수 있다", "예제를 접하기 쉽다") }
            .also { it.mapIndexed{i,  장점 -> println ("$i $장점") } }
            .let  { it.size } // also 이전의 값이 it
            .let  { println ("장점이 ${it}개나 된다.")}


        var bad : String? = null
        bad.let { "오픈소스의 단점은" }
            .run  {
                println(this);
                if( this.indexOf("오픈소스") < 0 ) null
                else listOf("법적문제가 어지러움", "맹신하다 망할 수 있음", "만드는 것보다 비주얼에 신경쓰게됨")
            }
            ?.also { it.mapIndexed{i,  단점 -> println ("$i $단점") } } // null이 아닐경우 실행됨
            ?.let  { it.size  }
            ?.let  { println ("단점이 ${it}개나 된다.")  }
    }
}