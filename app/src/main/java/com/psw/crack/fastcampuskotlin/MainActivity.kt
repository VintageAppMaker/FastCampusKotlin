package com.psw.crack.fastcampuskotlin
import advance.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import basic.AnyTypeTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면의 시작
        // 1.
        doTest(InfixTest(::WriteLn))
        doTest(LambdasTest(::WriteLn))
        doTest(AnyTypeTest(::WriteLn))
        doTest(FuncExtTest(::WriteLn))
        doTest(NewStyle1(::WriteLn))
        doTest(NewStyle2(::WriteLn))
    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( s : String) {
        txtMessage.text = "${txtMessage.text}${s}\n"
    }

}
