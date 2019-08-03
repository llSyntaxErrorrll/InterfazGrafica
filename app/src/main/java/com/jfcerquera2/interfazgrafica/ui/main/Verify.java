package com.jfcerquera2.interfazgrafica.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jfcerquera2.interfazgrafica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Verify extends Fragment {


    public Verify() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View viewx =inflater.inflate(R.layout.fragment_verify, container, false);

        Button x = viewx.findViewById(R.id.sinActividad);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(viewx.getContext(), "Falta funcionalidad.", Toast.LENGTH_SHORT).show();
            }
        });

        return viewx;
    }

}
