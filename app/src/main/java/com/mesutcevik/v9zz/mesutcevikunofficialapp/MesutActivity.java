package com.mesutcevik.v9zz.mesutcevikunofficialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MesutActivity extends AppCompatActivity {
    WebView MesutView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesut);
        MesutView=(WebView)findViewById(R.id.MesutWebView);

        MesutView.getSettings().setJavaScriptEnabled(true);
        MesutView.setWebChromeClient(new WebChromeClient());

        MesutView.loadUrl("http://www.mesutcevik.com");
        }
    @Override
    public void onBackPressed()
    {
        if(MesutView.canGoBack())
        {
            MesutView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
