package com.stark98.kaal;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class SecondActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    public static final String Extra = "com.stark98.kaal.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.link2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "link2";
                Intent intent = new Intent(SecondActivity.this, WebActivity.class);
                intent.putExtra(Extra,msg);
                startActivity(intent);
            }
        });
    }
    public void prime_number(View view) {
        editText = findViewById(R.id.num2);
        String str = editText.getText().toString();
        int n = Integer.parseInt(str);
        int m, count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 0) {
                Toast.makeText(this, "Entered Number is Prime Number", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Entered Number is Not a Prime Number", Toast.LENGTH_LONG).show();
            }
        }
    }
}