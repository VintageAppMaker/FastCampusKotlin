package com.psw.crack.fastcampuskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psw.crack.fastcampuskotlin.basic.First
import com.psw.crack.fastcampuskotlin.basic.Second
import com.psw.crack.fastcampuskotlin.basic.Third
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면의 시작
        // 1.
        First()
        Second()
        Third()
    }

    fun WriteLn( s : String) {
        txtMessage.text = "${txtMessage.text}${s}\n"
    }

}
