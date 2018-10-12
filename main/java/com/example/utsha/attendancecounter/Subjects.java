package com.example.utsha.attendancecounter;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Subjects extends AppCompatActivity {

    MediaPlayer mp;
    EditText e1,e2,e3,e4,e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setIcon(R.mipmap.icon_my);

        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        e4=(EditText) findViewById(R.id.editText4);
        e5=(EditText) findViewById(R.id.editText5);
        mp=MediaPlayer.create(this,R.raw.sample);

    }


    public void saveas(View view)
    {

        if(e1.length()==0 && e2.length()==0 && e3.length()==0 && e4.length()==0 && e5.length()==0){
            Toast.makeText(getApplicationContext(),"Fields can not be empty", Toast.LENGTH_LONG).show();
        }
        else {
            mp.start();
            SharedPreferences sps = getSharedPreferences("utsfile",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sps.edit();
            editor.putString("subject1", e1.getText().toString());
            editor.apply();
            editor.putString("subject2", e2.getText().toString());
            editor.apply();
            editor.putString("subject3", e3.getText().toString());
            editor.apply();
            editor.putString("subject4", e4.getText().toString());
            editor.apply();
            editor.putString("subject5", e5.getText().toString());
            editor.apply();

            e1.setText("");
            e2.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");

            Toast.makeText(getApplicationContext(),"Subjects Added", Toast.LENGTH_LONG).show();
        }
    }



}
