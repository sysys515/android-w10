package com.example.day10test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //FragmentActivity 클래스를 상속받아야 하지만, AppCompatActivity가 상속함!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setFrag1(View v) {
        //FragmentManager를 통해 FragmentTransaction 획득
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft=manager.beginTransaction();
        //FragmentTransaction 이용해서 프래그먼트를 인스턴스화하고 액티비티의 레이아웃에 프래그먼트 객체를 추가함!

        ft.replace(R.id.frame_container,new fragment1(),"one"); //프래그먼트 교체
        ft.commitAllowingStateLoss(); //Transaction을 등록, ft.commit(): 사용가능!
    }

    public void setFrag2(View v) {
        //FragmentManager를 통해 FragmentTransaction 획득
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft=manager.beginTransaction();

        ft.replace(R.id.frame_container,new Fragment2(),"two"); //프래그먼트 교체
        ft.commitAllowingStateLoss(); //Transaction을 등록, ft.commit(): 사용가능!
    }
}