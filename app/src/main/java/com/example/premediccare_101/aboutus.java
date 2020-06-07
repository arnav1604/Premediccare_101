package com.example.premediccare_101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus extends AppCompatActivity {
    WebView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        WebView webView = view.findViewById(R.id.about);
        WebSettings webSettings=webView.getSettings();//initialising web view object
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://www.premediccare.rf.gd/about.php");
        webView.setWebViewClient(new WebViewClient());

    }
}