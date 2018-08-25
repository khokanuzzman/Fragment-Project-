package com.example.khokan.fragmentproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by USER on 8/25/2018.
 */

public class FragmentTwo extends Fragment {

    View v2;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        v2= inflater.inflate(R.layout.fragment_two_layout,container,false);

        return v2;
    }
}
