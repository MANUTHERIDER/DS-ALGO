package com.stark98.kaal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class FourActivity extends AppCompatActivity {
    Button allIn;
    public static final String Extra_Message1= "com.stark98.kaal.extra.MESSAGE";
        EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        allIn = findViewById(R.id.link4);
        allIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourActivity.this, WebActivity.class);
                String msg="link4";
                intent.putExtra(Extra_Message1, msg);
                startActivity(intent);
            }
        });

    }

    public void composite(View view) {
        editText= findViewById(R.id.num3);
        String str= editText.getText().toString();
        int n=Integer.parseInt(str);
        int count=0;
        String str2="";
        if (n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        count++;
                    }

                }
                if (count > 2) {
                    str2 = str2 + " "+i;
                }
                count = 0;
            }
            Toast.makeText(this, str2 , Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Sorry, Max Limit is 50", Toast.LENGTH_SHORT).show();
        }

    }
}

