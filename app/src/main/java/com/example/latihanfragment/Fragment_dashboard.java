package com.example.latihanfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewGroupCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_dashboard extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
                             container, @Nullable Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_dashboard, null);
    }
}
