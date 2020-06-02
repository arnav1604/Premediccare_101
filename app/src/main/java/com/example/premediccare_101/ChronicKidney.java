package com.example.premediccare_101;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChronicKidney extends Fragment {
    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_chronic_kidney,container,false);
        WebView webView = view.findViewById(R.id.chronickdnay);
        WebSettings webSettings=webView.getSettings();//initialising web view object
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://chronickidneypred.herokuapp.com/");
        return view;
}}
