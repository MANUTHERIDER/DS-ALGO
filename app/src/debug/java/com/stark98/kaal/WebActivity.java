package com.stark98.kaal;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
                webUrl = "";
            }
            case "link3": {
                webUrl = "";
            }
            case "link4": {
                webUrl = "";
            }
            case "link5": {
                webUrl = "";
            }
            case "link6": {
                webUrl = "";
            }
            case "link7": {
                webUrl = "";
            }
            case "link8": {
                webUrl = "";
            }
            case "link9": {
                webUrl = "";
            }
            case "link10": {
                webUrl = "";
            }
            case "link11": {
                webUrl = "";
            }
            case "link12": {
                webUrl = "";
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
