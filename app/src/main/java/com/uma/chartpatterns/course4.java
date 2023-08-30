package com.uma.chartpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class course4 extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course4);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter1 = new Intent(course4.this,c4pattern1.class);
                startActivity(chapter1);
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter2 = new Intent(course4.this,c4pattern2.class);
                startActivity(chapter2);
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter3 = new Intent(course4.this,c4pattern3.class);
                startActivity(chapter3);
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter4 = new Intent(course4.this,c4pattern4.class);
                startActivity(chapter4);
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter5 = new Intent(course4.this,c4pattern5.class);
                startActivity(chapter5);
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter6 = new Intent(course4.this,c4pattern6.class);
                startActivity(chapter6);
            }
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter7 = new Intent(course4.this,c4pattern7.class);
                startActivity(chapter7);
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter8 = new Intent(course4.this,c4pattern8.class);
                startActivity(chapter8);
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter9 = new Intent(course4.this,c4pattern9.class);
                startActivity(chapter9);
            }
        });

        btn10 = findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter10 = new Intent(course4.this,c4pattern10.class);
                startActivity(chapter10);
            }
        });
    }
}