package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwelveActivity extends AppCompatActivity {
    Button btn ;
    public  static  final  String Extra = "com.stark98.kaal.extra.MESSAGE";

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        btn = findViewById(R.id.link12);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwelveActivity.this, WebActivity.class);
                String msg ="link12";
                intent.putExtra(Extra, msg);
                startActivity(intent);
            }
        });
    }
}
