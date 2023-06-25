package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CharacterList extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);

        fragmentManager = getSupportFragmentManager();//무슨클래스인지 공부하기
        fragmentTransaction = fragmentManager.beginTransaction();//무슨클래스인지 공부하기
        fragmentTransaction.replace(R.id.appframe,new list()); //이렇게new하면 새로고침되ㅁ
        fragmentTransaction.commit();

        //----------------------------bottom nav관련
        bottomNavigationView = findViewById(R.id.bottomNav); //activity_character_list.xml 하단에 만들어준 Nav
        bottomNavigationView.setOnItemSelectedListener(item -> {

            if(item.getItemId() ==R.id.list){
                changeFragment(new list()); //프래그먼트 객체 추가
            }else if(item.getItemId() ==R.id.add){
                changeFragment(new add());
            } else{
                changeFragment(new like());
            }
            return true;
        });

    }

    private void changeFragment(Fragment fragment){
        fragmentTransaction.replace(R.id.appframe,fragment);
        fragmentTransaction.commit();
    }


}