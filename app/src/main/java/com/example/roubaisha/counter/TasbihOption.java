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

    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih_option);
        getSupportActionBar().setTitle("Tasbih");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spaceNavigationView = findViewById(R.id.space);

        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_home_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_muslim_man_praying));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_access_time_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_muslim_tasbih));

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(TasbihOption.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                //Toast.makeText(DashboardActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                spaceNavigationView.setCentreButtonSelectable(true);

                if (itemIndex ==0 )
                {
                    Intent intent = new Intent(TasbihOption.this,DashboardActivity.class);
                    startActivity(intent);
                }else if (itemIndex == 1)
                {
                    Intent intent = new Intent(TasbihOption.this,PrayerGuidance.class);
                    startActivity(intent);
                }else if (itemIndex == 2)
                {
                    Intent intent = new Intent(TasbihOption.this, PrayerTimeActivity.class);
                    startActivity(intent);
                }else if (itemIndex == 3)
                {
                    Intent intent = new Intent(TasbihOption.this,TasbihOption.class);
                    startActivity(intent);
                }else {}
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(TasbihOption.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });



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
