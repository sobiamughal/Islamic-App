package com.example.roubaisha.counter.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.roubaisha.counter.R;

public class Ishawitr extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterIW myadapters;
    private Toolbar mTopToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishawitr);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterIW(this);
        viewPagers.setAdapter(myadapters);
    }
}