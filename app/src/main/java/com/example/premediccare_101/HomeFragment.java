package com.example.premediccare_101;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class HomeFragment extends DialogFragment {
    Button bdepartment, bblog, bdoctor, baboutus, bcontact;
WebView department,blog,doctor,aboutus;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        bdepartment = v.findViewById(R.id.b_dept);
        bdepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent depart = new Intent(getActivity(),Departments.class);
                startActivity(depart);
                requireActivity().overridePendingTransition(0,0);
            }
        });

        bdoctor = v.findViewById(R.id.b_doc);
        bdoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doc=new Intent(getActivity(),Doctor.class);
                startActivity(doc);
                requireActivity().overridePendingTransition(0,0);
            }
        });
        bblog = v.findViewById(R.id.b_blog);
        bblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Blog.class);
                startActivity(i);
                requireActivity().overridePendingTransition(0, 0);
            }
        });

        baboutus = v.findViewById(R.id.b_about);
        baboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about=new Intent(getActivity(),Blog.class);
                startActivity(about);
                requireActivity().overridePendingTransition(0,0);
            }
        });
        bcontact = v.findViewById(R.id.b_cont);
        bcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog_Fragment mdialog=new Dialog_Fragment();
                mdialog.show(requireActivity().getSupportFragmentManager(),"My Fragment");
            }
        });
        return v;
    }
}