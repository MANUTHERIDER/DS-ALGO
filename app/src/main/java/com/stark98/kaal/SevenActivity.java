package com.stark98.kaal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SevenActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    public static final String Extra = "com.stark98.kaal.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        btn = findViewById(R.id.link7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SevenActivity.this, WebActivity.class);
                String msg = "link7";
                intent.putExtra(Extra, msg);
                startActivity(intent);
            }
        });

    }

    public void fibbonaci(View view) {
        editText = findViewById(R.id.num7);
        String str = editText.getText().toString();

        String str2 = "";
        int n = Integer.parseInt(str);
        if (n <= 50) {
            int n1 = 0, n2 = 1, n3, i, count = 10;
            str2=str2+" "+n1+" "+n2;
            for (i = 3; i <=n; ++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3 = n1 + n2;
                str2=str2+" "+n3;
                n1 = n2;
                n2 = n3;
            }
            Toast.makeText(this, str2 ,Toast.LENGTH_LONG).show();
    }
        else
            {

                Toast.makeText(this,"Sorry, Max Limit 50",Toast.LENGTH_SHORT).show();
                }

                }
                }
