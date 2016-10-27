package com.trafficcop.trafficcontrol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tuong on 10/26/16.
 */

public class TrafficControlFragment extends Fragment {
    public static String TAG = "TrafficControlFragment";


    public TrafficControlFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_dashboard, container, false);
    }
}
