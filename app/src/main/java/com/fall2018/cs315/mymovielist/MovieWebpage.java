package com.fall2018.cs315.mymovielist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MovieWebpage extends AppCompatActivity{

    public static final String WEB_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie_webpage);

        String url = getIntent().getStringExtra(WEB_URL);

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);
    }
}
