package com.example.premediccare_101;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class HomeFragment extends Fragment {
    Button b1, b2, b3, b4, b5;
WebView
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        b1 = v.findViewById(R.id.b_dept);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "http://premediccare.rf.gd/departments-user.php";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });

        b2 = v.findViewById(R.id.b_doc);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "http://premediccare.rf.gd/doctors-user.php";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b3 = v.findViewById(R.id.b_blog);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s = "http://premediccare.rf.gd/doctors-user.php";
                        Uri u = Uri.parse("http://" + s);
                        Intent i = new Intent(Intent.ACTION_VIEW, u);
                        startActivity(i);
                    }
                });
            }
        });

        b4 = v.findViewById(R.id.b_about);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "http://premediccare.rf.gd/about-user.php";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        b5 = v.findViewById(R.id.b_cont);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "http://premediccare.rf.gd/doctors-user.php";
                Uri u = Uri.parse("http://" + s);
                Intent i = new Intent(Intent.ACTION_VIEW, u);
                startActivity(i);
            }
        });
        return v;
    }

    private FragmentManager getSupportFragmentManager() {
    }

}