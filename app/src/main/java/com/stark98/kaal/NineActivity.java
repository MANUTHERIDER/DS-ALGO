package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NineActivity extends AppCompatActivity {
    Button allIn;
    public  static  final  String Extra = "com.stark98.kaal.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        allIn = findViewById(R.id.link9);
        allIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NineActivity.this, WebActivity.class);
                String msg="link9";
                intent.putExtra(Extra, msg);
                startActivity(intent);
            }
        });
    }
}