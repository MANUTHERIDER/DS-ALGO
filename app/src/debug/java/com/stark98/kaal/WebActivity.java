package com.stark98.kaal;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    private String webUrl = "https://www.geeksforgeeks.org";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent intent = getIntent();
        String message = intent.getStringExtra(FourActivity.Extra_Message1);
        switch (message) {
            case "link2": {
                webUrl = "https://www.geeksforgeeks.org/prime-numbers/";
                break;
            }
            case "link3": {
                webUrl = "https://www.geeksforgeeks.org/quick-sort/";
                break;
            }
            case "link4": {
                webUrl = "https://www.geeksforgeeks.org/composite-number/";
                break;
            }
            case "link5": {
                webUrl = "https://www.geeksforgeeks.org/merge-sort/";
                break;
            }
            case "link6": {
                webUrl = "https://www.geeksforgeeks.org/linear-search/";
                break;
            }
            case "link7": {
                webUrl = "https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/";
                break;
            }
            case "link8": {
                webUrl = "https://www.geeksforgeeks.org/binary-search/";
                break;
            }
            case "link9": {
                webUrl = "https://www.geeksforgeeks.org/bubble-sort/";
                break;
            }
            case "link10": {
                webUrl = "https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/";
                break;
            }
            case "link11": {
                webUrl = "https://www.geeksforgeeks.org/counting-sort/";
                break;
            }
            case "link12": {
                webUrl = "https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/";
                break;
            }
            default:
            {
                Toast.makeText(this, "Link not Found", Toast.LENGTH_SHORT).show();
            }
        }
        webView = (WebView) findViewById(R.id.mywebView);
        webView.loadUrl(webUrl);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                url = webUrl;
                view.loadUrl(url);
                return true;
            }
        });


    }
}
