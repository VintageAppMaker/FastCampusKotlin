package com.psw.crack.fastcampuskotlin.javainterlop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.psw.crack.fastcampuskotlin.R;

// static하게 import한다.
import static com.psw.crack.fastcampuskotlin.javainterlop.JavaActivitytKt.kotlinEventHandler;

public class javaActivity extends AppCompatActivity {

    String sMessage = "Hi, Java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        // kotlin으로 만든 확장함수 사용하기
        kotlinEventHandler(this);

        // kotlin File에서
        usingKotlin();
    }

    private void usingKotlin() {
        // Kotlin 가져오기
        // class가 아닌 변수와 함수는 자동으로 변환한다.
        // 파일명을 대소문자 변경 후, 뒤에 Kt를 붙인다.
        // 그리고 . 연산자 이후에 사용가능
        KotlinTestKt.MyTest();
        KotlinTestKt.getName();

        // 클래스명은 그대로 사용가능
        // 어노테이션으로 자바에서 사용할 것을 지정해주어야 함.
        Log.d("TEST", KotlinExport.name);

        KotlinExport.age = 30;
        KotlinExport.test();

        KotlinExport ke = new KotlinExport();
        ke.test2();
    }
}
