package com.example.premediccare_101;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Pnemonia extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_pnemonia,container,false);
        WebView webView = view.findViewById(R.id.nimonia);
        WebSettings webSettings=webView.getSettings();//initialising web view object
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://pneumoniapred.herokuapp.com/");
        return view;
    }
}
