package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//
        setContentView(R.layout.activity_main); //어떤 레이아웃을 화면에 보여줄건지

        //버튼
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {//메소드(인터페이스)
            @Override
            public void onClick(View v) {//컴포넌트
                Intent intent = new Intent(getApplicationContext(),CharacterList.class);
                startActivity(intent);
            }
        });
    }
}