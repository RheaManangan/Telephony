package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnmsg1=(Button) findViewById(R.id.btnmsg1);
        Button btncall1=(Button) findViewById(R.id.btncall1);
        Button btnmsg2=(Button) findViewById(R.id.btnmsg2);
        Button btncall2=(Button) findViewById(R.id.btncall2);
        Button btnmsg3=(Button) findViewById(R.id.btnmsg3);
        Button btncall3=(Button) findViewById(R.id.btncall3);
        Button btnmsg4=(Button) findViewById(R.id.btnmsg4);
        Button btncall4=(Button) findViewById(R.id.btncall4);
        Button btnmsg5=(Button) findViewById(R.id.btnmsg5);
        Button btncall5=(Button) findViewById(R.id.btncall5);



        btnmsg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MessageClass.class);
                startActivity(intent);

            }
        });
        btncall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,CallClass.class);
                startActivity(intent1);

            }
        });

        btnmsg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MessageClass2.class);
                startActivity(intent);

            }
        });
        btncall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,CallClass2.class);
                startActivity(intent2);

            }
        });

        btnmsg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MessageClass3.class);
                startActivity(intent);

            }
        });
        btncall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,CallClass3.class);
                startActivity(intent2);

            }
        });

        btnmsg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MessageClass4.class);
                startActivity(intent);

            }
        });
        btncall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,CallClass4.class);
                startActivity(intent2);

            }
        });



        btnmsg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MessageClass5.class);
                startActivity(intent);

            }
        });
        btncall5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,CallClass5.class);
                startActivity(intent2);

            }
        });

    }
}

