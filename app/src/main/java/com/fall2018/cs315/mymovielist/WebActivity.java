package com.fall2018.cs315.mymovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = "https://www.imdb.com/";

        WebView web = (WebView) findViewById(R.id.webView);

        WebSettings WebSettings = web.getSettings();
        WebSettings.setJavaScriptEnabled(true);

        web.loadUrl(url);







    }
}
