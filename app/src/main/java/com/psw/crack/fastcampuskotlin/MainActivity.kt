package com.psw.crack.fastcampuskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import basic.AnyTypeTest
import com.psw.crack.fastcampuskotlin.step1.FirstTest
import com.psw.crack.fastcampuskotlin.step1.NumberTest
import com.psw.crack.fastcampuskotlin.step1.StringTest

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면의 시작
        doTest(FirstTest(::WriteLn))
        doTest(AnyTypeTest(::WriteLn))
        doTest(NumberTest(::WriteLn))
        doTest(StringTest(::WriteLn))
    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( any : Any) {
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }

}
