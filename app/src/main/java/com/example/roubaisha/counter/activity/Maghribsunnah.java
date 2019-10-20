package com.example.roubaisha.counter.activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.roubaisha.counter.R;

public class Maghribsunnah extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterMS myadapters;
    private Toolbar mTopToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maghribsunnah);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterMS(this);
        viewPagers.setAdapter(myadapters);
    }
}