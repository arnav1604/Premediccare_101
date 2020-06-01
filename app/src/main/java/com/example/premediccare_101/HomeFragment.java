package com.example.premediccare_101;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

       // WebView webView = view.findViewById(R.id.wv_h);

        //WebView mwebview = findViewById(R.id.webview);//linking web view to my java file of the activity

        /*WebSettings webSettings=webView.getSettings();//initialising web view object

        webSettings.setJavaScriptEnabled(true);//enabling site to be displayed in the app. The site needs to be built using javascript for this to happen

        webView.loadUrl("http://www.premediccare.rf.gd/");//specifying url of the site to be displayed

        webView.setWebViewClient(new WebViewClient());*/


        return view;
    }
}
