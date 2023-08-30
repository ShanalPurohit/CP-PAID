package com.uma.chartpatterns;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

import java.util.List;

public class home extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    ImageView img1,img2,img3,img4;

 ImageSlider img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        img = findViewById(R.id.slider);

        img1 = findViewById(R.id.youtube);
        img2 = findViewById(R.id.fb);
        img3 = findViewById(R.id.playstore);
        img4 = findViewById(R.id.share);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refundIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@trendg7696"));
                startActivity(refundIntent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refundIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100086067647581&mibextid=ZbWKwL"));
                startActivity(refundIntent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stockmarketapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.uma.stockmarket"));
                startActivity(stockmarketapp);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareapp = new Intent(Intent.ACTION_SEND);
                    shareapp.setType("text/plain");
                    String shareMessage = "https://play.google.com/store/apps/details?id=com.uma.chartpatterns";
                    shareapp.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareapp, "Share App"));
                }catch (Exception e){
                    Toast.makeText(home.this,"Error! Not Shared Try Again:)", Toast.LENGTH_LONG).show();
                }
            }
        });

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.feature1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.backg1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.backg2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.backg3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.backg4, ScaleTypes.FIT));
        img.setImageList(slideModels, ScaleTypes.CENTER_CROP);
        img.setImageList(slideModels);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stockmarketapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.uma.stockmarket"));
                startActivity(stockmarketapp);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course1 = new Intent(home.this, course1.class);
                startActivity(course1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course11 = new Intent(home.this, course1.class);
                startActivity(course11);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course2 = new Intent(home.this, course2.class);
                startActivity(course2);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course3 = new Intent(home.this, course3.class);
                startActivity(course3);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course4 = new Intent(home.this, course4.class);
                startActivity(course4);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent course5 = new Intent(home.this, course5.class);
                startActivity(course5);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.setting) {
            Intent settingintent = new Intent(home.this, settings.class);
            startActivity(settingintent);
        }
        return super.onOptionsItemSelected(item);
    }
}