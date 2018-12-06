package com.psw.crack.fastcampuskotlin.javainterlop

import kotlinx.android.synthetic.main.activity_java.*
import java.util.*

// java로 만든 클래스에서도 확장함수 추가가 가능하다!!
fun javaActivity.kotlinEventHandler(){
    // javaActivity에서 선언한 멤버필드
    val s = sMessage

    // javaActivity에서 정의한 Control
    btnOk.setOnClickListener {

        // JavaTest에서 Static하게 선언한 메소드
        JavaTest.T(applicationContext, "${s} ${Date().toString()}")
    }
}
