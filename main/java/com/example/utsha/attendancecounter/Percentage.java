package com.example.utsha.attendancecounter;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Percentage extends AppCompatActivity {

    MediaPlayer mp;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setIcon(R.mipmap.icon_my);
        setContentView(R.layout.activity_percentage);

        t1 = (TextView)findViewById(R.id.textView01);
        t2 = (TextView)findViewById(R.id.textView02);
        t3 = (TextView)findViewById(R.id.textView03);
        t4 = (TextView)findViewById(R.id.textView04);
        t5 = (TextView)findViewById(R.id.textView05);

        t6 = (TextView)findViewById(R.id.textView1);
        t7 = (TextView)findViewById(R.id.textView2);
        t8 = (TextView)findViewById(R.id.textView3);
        t9 = (TextView)findViewById(R.id.textView4);
        t10 =(TextView)findViewById(R.id.textView5);


        mp=MediaPlayer.create(this,R.raw.sample);

        SharedPreferences sps = getSharedPreferences("utsfile",Context.MODE_PRIVATE);
        String s1 = sps.getString("subject1","N/A");
        t1.setText(s1.toString());
        String s2 = sps.getString("subject2","N/A");
        t2.setText(s2.toString());
        String s3 = sps.getString("subject3","N/A");
        t3.setText(s3.toString());
        String s4 = sps.getString("subject4","N/A");
        t4.setText(s4.toString());
        String s5 = sps.getString("subject5","N/A");
        t5.setText(s5.toString());


        SharedPreferences sp1 = getSharedPreferences("att1", Context.MODE_PRIVATE);
        float c1 = sp1.getFloat("c1",0);
        t6.setText(Float.toString(c1)+"%");

        SharedPreferences sp2 = getSharedPreferences("att2", Context.MODE_PRIVATE);
        float c2 = sp2.getFloat("c1",0);
        t7.setText(Float.toString(c2)+"%");

        SharedPreferences sp3 = getSharedPreferences("att3", Context.MODE_PRIVATE);
        float c3 = sp3.getFloat("c1",0);
        t8.setText(Float.toString(c3)+"%");

        SharedPreferences sp4 = getSharedPreferences("att4", Context.MODE_PRIVATE);
        float c4 = sp4.getFloat("c1",0);
        t9.setText(Float.toString(c4)+"%");

        SharedPreferences sp5 = getSharedPreferences("att5", Context.MODE_PRIVATE);
        float c5 = sp5.getFloat("c1",0);
        t10.setText(Float.toString(c5)+"%");


    }

    public void add1(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp1 = getSharedPreferences("att1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sp1.edit();
                float a1 = sp1.getFloat("a1",0);
                float b1 = sp1.getFloat("b1",0);
                float c1 = sp1.getFloat("c1",0);
                a1++;
                b1++;
                c1=(a1/b1)*100;
                editor1.putFloat("a1",a1);
                editor1.apply();
                editor1.putFloat("b1",b1);
                editor1.apply();
                editor1.putFloat("c1",c1);
                editor1.apply();

                t6.setText(Float.toString(c1)+"%");

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

    public void add2(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp2 = getSharedPreferences("att2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2 = sp2.edit();
                float a1 = sp2.getFloat("a1",0);
                float b1 = sp2.getFloat("b1",0);
                float c1 = sp2.getFloat("c1",0);
                a1++;
                b1++;
                c1=(a1/b1)*100;
                editor2.putFloat("a1",a1);
                editor2.apply();
                editor2.putFloat("b1",b1);
                editor2.apply();
                editor2.putFloat("c1",c1);
                editor2.apply();

                t7.setText(Float.toString(c1)+"%");

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

    public void add3(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp3 = getSharedPreferences("att3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor3 = sp3.edit();
                float a1 = sp3.getFloat("a1",0);
                float b1 = sp3.getFloat("b1",0);
                float c1 = sp3.getFloat("c1",0);
                a1++;
                b1++;
                c1=(a1/b1)*100;
                editor3.putFloat("a1",a1);
                editor3.apply();
                editor3.putFloat("b1",b1);
                editor3.apply();
                editor3.putFloat("c1",c1);
                editor3.apply();

                t8.setText(Float.toString(c1)+"%");

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

    public void add4(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp4 = getSharedPreferences("att4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor4 = sp4.edit();
                float a1 = sp4.getFloat("a1",0);
                float b1 = sp4.getFloat("b1",0);
                float c1 = sp4.getFloat("c1",0);
                a1++;
                b1++;
                c1=(a1/b1)*100;
                editor4.putFloat("a1",a1);
                editor4.apply();
                editor4.putFloat("b1",b1);
                editor4.apply();
                editor4.putFloat("c1",c1);
                editor4.apply();

                t9.setText(Float.toString(c1)+"%");

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

    public void add5(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp5 = getSharedPreferences("att5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor5 = sp5.edit();
                float a1 = sp5.getFloat("a1",0);
                float b1 = sp5.getFloat("b1",0);
                float c1 = sp5.getFloat("c1",0);
                a1++;
                b1++;
                c1=(a1/b1)*100;
                editor5.putFloat("a1",a1);
                editor5.apply();
                editor5.putFloat("b1",b1);
                editor5.apply();
                editor5.putFloat("c1",c1);
                editor5.apply();

                t10.setText(Float.toString(c1)+"%");

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

    public void sub1(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp1 = getSharedPreferences("att1", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sp1.edit();
                float a1 = sp1.getFloat("a1",0);
                float b1 = sp1.getFloat("b1",0);
                float c1 = sp1.getFloat("c1",0);
                b1++;
                c1=(a1/b1)*100;
                editor1.putFloat("a1",a1);
                editor1.apply();
                editor1.putFloat("b1",b1);
                editor1.apply();
                editor1.putFloat("c1",c1);
                editor1.apply();

                t6.setText(Float.toString(c1)+"%");

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

    public void sub2(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp2 = getSharedPreferences("att2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2 = sp2.edit();
                float a1 = sp2.getFloat("a1",0);
                float b1 = sp2.getFloat("b1",0);
                float c1 = sp2.getFloat("c1",0);
                b1++;
                c1=(a1/b1)*100;
                editor2.putFloat("a1",a1);
                editor2.apply();
                editor2.putFloat("b1",b1);
                editor2.apply();
                editor2.putFloat("c1",c1);
                editor2.apply();

                t7.setText(Float.toString(c1)+"%");

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

    public void sub3(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp3 = getSharedPreferences("att3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor3 = sp3.edit();
                float a1 = sp3.getFloat("a1",0);
                float b1 = sp3.getFloat("b1",0);
                float c1 = sp3.getFloat("c1",0);
                b1++;
                c1=(a1/b1)*100;
                editor3.putFloat("a1",a1);
                editor3.apply();
                editor3.putFloat("b1",b1);
                editor3.apply();
                editor3.putFloat("c1",c1);
                editor3.apply();

                t8.setText(Float.toString(c1)+"%");

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

    public void sub4(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp4 = getSharedPreferences("att4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor4 = sp4.edit();
                float a1 = sp4.getFloat("a1",0);
                float b1 = sp4.getFloat("b1",0);
                float c1 = sp4.getFloat("c1",0);
                b1++;
                c1=(a1/b1)*100;
                editor4.putFloat("a1",a1);
                editor4.apply();
                editor4.putFloat("b1",b1);
                editor4.apply();
                editor4.putFloat("c1",c1);
                editor4.apply();

                t9.setText(Float.toString(c1)+"%");
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

    public void sub5(View view){
        mp.start();

        AlertDialog.Builder builder  = new AlertDialog.Builder(this);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View v = layoutInflater.inflate(R.layout.custom_alert3,null);
        final Button B1= (Button)v.findViewById(R.id.buttonyyy);
        final Button B2= (Button)v.findViewById(R.id.buttonnnn);

        builder.setView(v);
        final AlertDialog alertDialog = builder.create();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                SharedPreferences sp5 = getSharedPreferences("att5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor5 = sp5.edit();
                float a1 = sp5.getFloat("a1",0);
                float b1 = sp5.getFloat("b1",0);
                float c1 = sp5.getFloat("c1",0);
                b1++;
                c1=(a1/b1)*100;
                editor5.putFloat("a1",a1);
                editor5.apply();
                editor5.putFloat("b1",b1);
                editor5.apply();
                editor5.putFloat("c1",c1);
                editor5.apply();

                t10.setText(Float.toString(c1)+"%");

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
