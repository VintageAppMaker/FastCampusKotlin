package com.psw.crack.fastcampuskotlin.javainterlop;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.psw.crack.fastcampuskotlin.R;

// static하게 import한다.
import static com.psw.crack.fastcampuskotlin.javainterlop.KotlinActivitytKt.kotlinEventHandler;

public class javaActivity extends AppCompatActivity {

    String sMessage = "Hi, Java";

    // kotlin에서 사용가능
    public void T(Context ctx, String sMessage){
        Toast.makeText(ctx, sMessage, Toast.LENGTH_LONG).show();
    }

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
        KotlinActivitytKt.getName();
        KotlinActivitytKt.MyTest();

        // 클래스명은 그대로 사용가능
        // 어노테이션으로 자바에서 사용할 것을 지정해주어야 함.
        Log.d("TEST", KotlinExport.name);

        KotlinExport.age = 30;
        KotlinExport.test();

        KotlinExport ke = new KotlinExport();
        ke.test2();
    }
}
