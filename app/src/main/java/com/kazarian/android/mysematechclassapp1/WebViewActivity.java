package com.kazarian.android.mysematechclassapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView vwweb = findViewById(R.id.wvWeb);

        vwweb.getSettings().setJavaScriptEnabled(true);
        vwweb.setWebViewClient(new WebViewClient());
        vwweb.loadUrl("https://mci.ir/");
    }
}