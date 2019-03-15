package com.example.roubaisha.counter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PrayerGuidance_Zuhar extends Fragment {
    private static final String TAG = "PrayerGuidanceActivity";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started.");
        View rootView = inflater.inflate(R.layout.fragment_prayer_guidance_zuhar, container, false);
        return rootView;
    }
}

