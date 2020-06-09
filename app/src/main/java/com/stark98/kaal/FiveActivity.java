package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class FiveActivity extends AppCompatActivity {
        Button btn;
        public static final String Extra_Message1= "com.stark98.kaal.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        btn=findViewById(R.id.link5);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FiveActivity.this , WebActivity.class);
                String msg= "link5";
                intent.putExtra(Extra_Message1, msg);
                startActivity(intent);
            }
        });
    }
}