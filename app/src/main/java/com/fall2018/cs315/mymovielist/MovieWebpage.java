package com.fall2018.cs315.mymovielist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MovieWebpage extends AppCompatActivity{

    public static final String WEB_URL = "";
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            //arguments.putString(MovieWebpage.WEB_URL, getIntent().getStringExtra(MovieWebpage));
            MovieWebpage fragment = new MovieWebpage();
            //fragment.setArguments(arguments);
            //getSupportFragmentManager().beginTransaction().add(R.id.webview, fragment).commit();
        }

        //setContentView(R.layout.activity_movie_webpage); // make xml file i guess

//        if(getArguments().containsKey(WEB_URL)) {
//            myWebView = findViewById(R.id.webview);
//            myWebView.loadUrl(WEB_URL);
//        }
    }
}
