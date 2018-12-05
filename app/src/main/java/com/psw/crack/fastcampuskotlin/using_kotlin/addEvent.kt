package com.psw.crack.fastcampuskotlin.using_kotlin

import android.content.Intent
import com.psw.crack.fastcampuskotlin.MainActivity
import com.psw.crack.fastcampuskotlin.javainterlop.javaActivity
import kotlinx.android.synthetic.main.activity_main.*

// 확장함수로 이벤트 핸들러를 등록
fun MainActivity.setClickHandler(){
    btnTest.setOnClickListener {
        var I = Intent(this, javaActivity::class.java)
        startActivity(I)
    }
}