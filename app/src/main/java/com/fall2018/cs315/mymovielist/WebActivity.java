package com.fall2018.cs315.mymovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    public static final String WEB_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);



        String url = getIntent().getStringExtra(WEB_URL);

        WebView web = (WebView) findViewById(R.id.webView1);
        web.loadUrl(url);


    }
}
