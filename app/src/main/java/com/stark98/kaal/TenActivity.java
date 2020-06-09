package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenActivity extends AppCompatActivity {
    Button btn ;
    public  static  final  String Extra = "com.stark98.kaal.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        btn = findViewById(R.id.link10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TenActivity.this, WebActivity.class);
                String msg ="link10";
                intent.putExtra(Extra, msg);
                startActivity(intent);
            }
        });
    }
}