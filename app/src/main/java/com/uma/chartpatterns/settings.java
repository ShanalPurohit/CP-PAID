package com.uma.chartpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareapp = new Intent(Intent.ACTION_SEND);
                    shareapp.setType("text/plain");
                    String shareMessage = "https://play.google.com/store/apps/details?id=com.uma.chartpatterns";
                    shareapp.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareapp, "Share App"));
                }catch (Exception e){
                    Toast.makeText(settings.this,"Error! Not Shared Try Again:)", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent privacyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://funapp22.blogspot.com/2023/06/chart-patterns-privacy-policy.html"));
                startActivity(privacyIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent termsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://funapp22.blogspot.com/2023/06/chart-patterns-terms-and-conditions.html"));
                startActivity(termsIntent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refundIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://funapp22.blogspot.com/2023/05/refund-policy.html"));
                startActivity(refundIntent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutus = new Intent(settings.this, aboutus.class);
                startActivity(aboutus);
            }
        });
    }
}