package com.example.roubaisha.counter.activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.roubaisha.counter.R;

public class Maghribnafil extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterMN myadapters;
    private Toolbar mTopToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maghribnafil);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterMN(this);
        viewPagers.setAdapter(myadapters);
    }
}