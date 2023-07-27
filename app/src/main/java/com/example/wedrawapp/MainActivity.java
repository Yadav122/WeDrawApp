package com.example.wedrawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RelativeLayout r1, r2, r3;
    ImageView latest1 , latest,latest3, popular1 , popular2 , popular3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.catogry1);
        r2 = findViewById(R.id.catogry2);
        r3 = findViewById(R.id.catogry3);
        latest1=findViewById(R.id.latest1);
        latest=findViewById(R.id.latest2);
        latest3=findViewById(R.id.latest3);
        popular1=findViewById(R.id.popular1);
        popular2=findViewById(R.id.popular2);
        popular3=findViewById(R.id.popular3);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimeActivity.class);
                startActivity(intent);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartoonActivity.class);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CarSlketchActivity.class);
                startActivity(intent);
            }
        });


        latest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latest1.class);
                startActivity(intent);
            }
        });
        latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, latest2.class);
                startActivity(intent);
            }
        });
        latest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, latest3.class);
                startActivity(intent);
            }
        });

        popular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, popular1.class);
                startActivity(intent);
            }
        });     popular2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, popular2.class);
                startActivity(intent);
            }
        });     popular3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, popular3.class);
                startActivity(intent);
            }
        });





    }


}