package com.psw.crack.fastcampuskotlin.javainterlop

import android.util.Log
import kotlinx.android.synthetic.main.activity_java.*
import java.util.*

// java로 만든 클래스에서도 확장함수 추가가 가능하다!!
fun javaActivity.kotlinEventHandler(){
    // javaActivity에서 선언한 멤버필드
    val s  = sMessage

    // javaActivity에서 정의한 Control
    btnOk.setOnClickListener {

        // javaActivity의  T 메소드 사용
        T(applicationContext, "${s} ${Date().toString()}")
    }
}

class KotlinExport{
    companion object {
        // 반드시 const로 선언
        const val name = "class msg"

        @JvmField var age = 32
        @JvmStatic fun test(){
            Log.d("TEST", "class 메소드")
        }

    }

    // java에서는 메소드처럼 사용됨
    // @JvmField var normal_variable로 하면 java에서도 멤버변수처럼 사용가능
    var normal_variable = "밖에서 액세스가능"

    fun test2(){
        Log.d("TEST", "일반메소드")
    }
}

// Kotlin 일반함수와 변수
// 파일명Kt.class 형식으로 생성된다(대소문자 변경유의).
var name = "msg"
fun MyTest(){}