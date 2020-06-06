package com.example.premediccare_101;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class Dialog_Fragment extends DialogFragment {
    Button ok;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.contact_dialogfragment,container,false);
        ok=view.findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = requireActivity().getSupportFragmentManager().findFragmentByTag("MyDialog");
                if(fragment != null) {
                    DialogFragment dialog = (DialogFragment) fragment;
                    dialog.dismiss();
                }        }
        });
        return inflater.inflate(R.layout.contact_dialogfragment,container,false);
    }
}
