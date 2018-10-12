package com.example.utsha.attendancecounter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setIcon(R.mipmap.icon_my);
        setContentView(R.layout.activity_logo);

        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();

                }finally{


                    nextActivity();


                }}} ;

        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public void nextActivity(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }


}
