package com.psw.crack.fastcampuskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psw.crack.fastcampuskotlin.step1.*
import com.psw.crack.fastcampuskotlin.step2.*
import com.psw.crack.fastcampuskotlin.step3.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면의 시작
        //doTest(FirstTest(::WriteLn))
        //doTest(AnyTypeTest(::WriteLn))
        //doTest(NumberTest(::WriteLn))
        //doTest(StringTest(::WriteLn))
        //doTest(FunctionTest(::WriteLn))
        //doTest(ConditionTest(::WriteLn))
        //doTest(LabelTest(::WriteLn))
        //doTest(CollectionsTest(::WriteLn))
        //doTest(ExceptionTest(::WriteLn))
        //doTest(ClassTest(::WriteLn))
        //doTest(PolyTest(::WriteLn))
        //doTest(InterAbstractTest(::WriteLn))
        //doTest(ObjectTest(::WriteLn))
        //doTest(DataClassTest(::WriteLn))
        //doTest(LambdasTest(::WriteLn))
        //doTest(ExtFuncTest(::WriteLn))
        //doTest(ClosureTest(::WriteLn))
        //doTest(ExtFunc2Test(::WriteLn))
        //doTest(DSLTest(::WriteLn))
        //doTest(CurryngTest(::WriteLn))
        //doTest(PropertiesTest(::WriteLn))
        //doTest(MultiReturnTest(::WriteLn))
        //doTest(InitTest(::WriteLn))
        doTest(InfixTest(::WriteLn))

    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( any : Any) {
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }

}
