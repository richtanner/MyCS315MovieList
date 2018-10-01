package com.fall2018.cs315.mymovielist;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    private WebView view;
    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        view = (WebView) findViewById(R.id.webview);
        settings = view.getSettings();

        WebViewClient web = new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String address, Bitmap bitmap) {
                super.onPageStarted(view, address, bitmap);
                setTitle("LOADING WEB PAGE . . .");
            }

            @Override
            public void onPageFinished(WebView view, String address) {
                super.onPageFinished(view, address);
                setTitle(view.getTitle());
            }

        };

        settings.setJavaScriptEnabled(true);

        view.setWebViewClient(web);
        view.loadUrl(getIntent().getStringExtra("URL"));
        ActionBar act = getSupportActionBar();
        if (act != null) {
            act.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        if(view.canGoBack()){
           view.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}