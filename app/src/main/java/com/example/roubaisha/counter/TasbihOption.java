package com.example.roubaisha.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.example.roubaisha.counter.UserTasbih.UserTasbih;
import com.example.roubaisha.counter.prayertime.PrayerTimeActivity;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class TasbihOption extends AppCompatActivity implements View.OnClickListener {

    private CardView tasbih, usertasbih;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih_option);

        getSupportActionBar().setTitle("Tasbih");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tasbih = (CardView) findViewById(R.id.tasbih);
        usertasbih = (CardView) findViewById(R.id.usertasbih);

        tasbih.setOnClickListener(this);
        usertasbih.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tasbih:
                Intent i = new Intent(TasbihOption.this,TasbihActivity.class);
                startActivity(i);
                break;
            case R.id.usertasbih:
                Intent in = new Intent(TasbihOption.this, UserTasbih.class);
                startActivity(in);
                break;
        }
    }
}
