package com.psw.crack.fastcampuskotlin.basic
import com.psw.crack.fastcampuskotlin.MainActivity

fun MainActivity.Second(){
    val 재료 = listOf("소", "감자", "닭", "옥수수")
    val 요리하삼 = { 재료 : String ->  when (재료){
        "소"     -> "햄버거"
        "감자"   -> "프랜치프라이"
        "닭"     -> "프라이드치킨"
        "옥수수" -> "팝콘"
        else -> "#@#@!!"}}

    재료.map {
        요리하삼(it)
    }.let { WriteLn (it.toString()) }

    val 채식요리 = 재료.filter {
        if ( it in listOf("감자", "옥수수") ) true else false
    }
    채식요리.map(요리하삼).let { WriteLn (it.toString()) }

    var 완제품 = 재료.reduce { acc, s -> "${acc} ${s}" }
    완제품.let(요리하삼).let{ WriteLn(it)}
}