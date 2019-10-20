package com.example.roubaisha.counter.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.roubaisha.counter.R;

public class Ishanafil extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterIN myadapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishanafil);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterIN(this);
        viewPagers.setAdapter(myadapters);
    }
}
