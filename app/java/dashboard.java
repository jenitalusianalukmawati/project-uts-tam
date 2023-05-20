package com.jenita.project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class dashboard extends Fragment {

    public dashboard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton profile = view.findViewById(R.id.imgProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_dashboard_to_profile);
            }
        });

        ImageButton history = view.findViewById(R.id.imgHistory);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_dashboard_to_riwayat2);
            }
        });

        ImageButton taxi = view.findViewById(R.id.imgTaxi);
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_dashboard_to_book_kereta);
            }
        });

        ImageButton pesawat = view.findViewById(R.id.imgPesawat);
        pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_dashboard_to_book_kereta);
            }
        });
        return view;
    }
}