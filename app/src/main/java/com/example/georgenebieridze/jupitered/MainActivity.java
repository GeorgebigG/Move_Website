package com.example.georgenebieridze.jupitered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView jupiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jupiter = (WebView) findViewById(R.id.jupiter);
        jupiter.setWebViewClient(new WebViewClient());
        jupiter.getSettings().setJavaScriptEnabled(true);
        jupiter.loadUrl(""); // your url here
    }
}
