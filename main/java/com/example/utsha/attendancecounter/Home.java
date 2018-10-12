package com.example.utsha.attendancecounter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.renderscript.ScriptGroup;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setIcon(R.mipmap.icon_my);
        mp=MediaPlayer.create(this,R.raw.sample);
        setContentView(R.layout.activity_home);
    }


    public void exitMethod(View view){
        mp.start();
        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert,null);
        final Button B1= (Button)v.findViewById(R.id.buttony);
        final Button B2= (Button)v.findViewById(R.id.buttonn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                finish();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                alertDialog.dismiss();
            }
        });

        alertDialog.show();

    }

    public void showdata(View view){
        mp.start();
        Intent i = new Intent(Home.this, Percentage.class);
        startActivity(i);
    }

    public void showme(View view){
        mp.start();
        Intent i = new Intent(Home.this, AboutMe.class);
        startActivity(i);
    }

    public void addsubjects(View view)
    {
        mp.start();
        Intent i = new Intent(Home.this, Subjects.class);
        startActivity(i);
    }

    public void clearalldata(View view){
        mp.start();
        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert2,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();


                SharedPreferences sps = getSharedPreferences("utsfile",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sps.edit();
                editor.putString("subject1", "N/A");
                editor.apply();
                editor.putString("subject2", "N/A");
                editor.apply();
                editor.putString("subject3", "N/A");
                editor.apply();
                editor.putString("subject4", "N/A");
                editor.apply();
                editor.putString("subject5", "N/A");
                editor.apply();

                SharedPreferences sp1 = getSharedPreferences("att1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sp1.edit();
                editor1.putFloat("a1",0);
                editor1.apply();
                editor1.putFloat("b1",0);
                editor1.apply();
                editor1.putFloat("c1",0);
                editor1.apply();

                SharedPreferences sp2 = getSharedPreferences("att2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2 = sp2.edit();
                editor2.putFloat("a1",0);
                editor2.apply();
                editor2.putFloat("b1",0);
                editor2.apply();
                editor2.putFloat("c1",0);
                editor2.apply();

                SharedPreferences sp3 = getSharedPreferences("att3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor3 = sp3.edit();
                editor3.putFloat("a1",0);
                editor3.apply();
                editor3.putFloat("b1",0);
                editor3.apply();
                editor3.putFloat("c1",0);
                editor3.apply();

                SharedPreferences sp4 = getSharedPreferences("att4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor4 = sp4.edit();
                editor4.putFloat("a1",0);
                editor4.apply();
                editor4.putFloat("b1",0);
                editor4.apply();
                editor4.putFloat("c1",0);
                editor4.apply();

                SharedPreferences sp5 = getSharedPreferences("att5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor5 = sp5.edit();
                editor5.putFloat("a1",0);
                editor5.apply();
                editor5.putFloat("b1",0);
                editor5.apply();
                editor5.putFloat("c1",0);
                editor5.apply();

                alertDialog.dismiss();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                alertDialog.dismiss();
            }
        });

        alertDialog.show();

    }


}
