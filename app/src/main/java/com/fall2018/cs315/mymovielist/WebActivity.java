package com.fall2018.cs315.mymovielist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    public static final String MOVIEURL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String url = getIntent().getStringExtra(MOVIEURL);

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);
    }

}
