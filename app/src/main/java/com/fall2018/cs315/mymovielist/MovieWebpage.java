package com.fall2018.cs315.mymovielist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MovieWebpage extends AppCompatActivity{

    public static final String WEB_URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie_webpage);

        String url = getIntent().getStringExtra(WEB_URL);

        WebView web = (WebView) findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                //hide loading image
                findViewById(R.id.imageLoading1).setVisibility(View.GONE);
                //show webview
                findViewById(R.id.webView).setVisibility(View.VISIBLE);
            }
        });

        web.loadUrl(url);
    }
}

/*
web.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                //hide loading image
                findViewById(R.id.imageLoading1).setVisibility(View.GONE);
                //show webview
                findViewById(R.id.webView).setVisibility(View.VISIBLE);
            }


        });
 */

/*
        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient() {

            ...

            @Override
            public void onPageFinished(WebView view, String url) {
                //hide loading image
                findViewById(R.id.imageLoading1).setVisibility(View.GONE);
                //show webview
                findViewById(R.id.webView1).setVisibility(View.VISIBLE);
            }


        });
        wv.loadUrl("http://yoururlhere.com");
*/
