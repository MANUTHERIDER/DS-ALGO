package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button firstButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstButton=findViewById(R.id.textView);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView2);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView3);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,FourActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView4);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,FiveActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView5);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,SixActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView6);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,SevenActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView7);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,EightActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView8);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,NineActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView9);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,TenActivity.class);
                startActivity(intent_one);
            }
        });
        firstButton=findViewById(R.id.textView10);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,ElevenActivity.class);
                startActivity(intent_one);
            }
        }); firstButton=findViewById(R.id.textView11);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,TwelveActivity.class);
                startActivity(intent_one);
            }
        });
    }

}