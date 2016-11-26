package com.hanbit.app.week161105.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hanbit.app.week161105.R;

public class WebActivity extends AppCompatActivity {
    WebView wv_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv_test = (WebView) findViewById(R.id.wv_test);
        wv_test.setWebViewClient(new WebViewClient());
        wv_test.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = wv_test.getSettings();
        wv_test.loadUrl("file:///android_asset/html/index.html");
        webSettings.setJavaScriptEnabled(true);
    }
}
