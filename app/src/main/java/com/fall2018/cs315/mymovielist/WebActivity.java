package com.fall2018.cs315.mymovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import static com.fall2018.cs315.mymovielist.MovieDetailFragment.ARG_ITEM_ID;

public class WebActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String url = getIntent().getExtras().getString("site");

        WebView web = (WebView) findViewById(R.id.webView);

        web.loadUrl(url);



    }


}
