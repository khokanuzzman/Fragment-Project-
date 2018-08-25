package com.example.khokan.fragmentproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by USER on 8/25/2018.
 */

public class FragmentOne extends Fragment {

    View v;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_one_layout,container,false);
        return v;

    }
}
