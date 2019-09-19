package com.example.roubaisha.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.roubaisha.counter.Map.MapsActivity;
import com.example.roubaisha.counter.Names.NamesOptionActivity;
import com.example.roubaisha.counter.Qibla.QiblaActivity;
import com.example.roubaisha.counter.activity.ScrollableTabsActivity;
import com.example.roubaisha.counter.duaen.DuaActivity;
import com.example.roubaisha.counter.prayertime.PrayerTimeActivity;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;


public class DashboardActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private Animation fadeIn, fadeOut;

    private RelativeLayout prayergbtn;
    private RelativeLayout tasbihbtn;
    private RelativeLayout nearestmosquebtn;
    private RelativeLayout prayertimebtn;
    private RelativeLayout pendingprayerbtn;
    private RelativeLayout namesbtn;

    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        spaceNavigationView = findViewById(R.id.space);

        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_home_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_dua_hands));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_access_time_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.ic_qibla_compass));

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(DashboardActivity.this,"Coming Soon", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                //Toast.makeText(DashboardActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                spaceNavigationView.setCentreButtonSelectable(true);

                if (itemIndex ==0 )
                {
                    Intent intent = new Intent(DashboardActivity.this,DashboardActivity.class);
                    startActivity(intent);
                }else if (itemIndex == 1)
                {
                    Intent intent = new Intent(DashboardActivity.this, DuaActivity.class);
                    startActivity(intent);
                }else if (itemIndex == 2)
                {
                    Intent intent = new Intent(DashboardActivity.this,PrayerTimeActivity.class);
                    startActivity(intent);
                }else if (itemIndex == 3)
                {
                    Intent intent = new Intent(DashboardActivity.this, QiblaActivity.class);
                    startActivity(intent);
                }else {}


            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(DashboardActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        viewFlipper.setInAnimation(fadeIn);
        viewFlipper.setOutAnimation(fadeOut);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();


        prayergbtn= findViewById(R.id.prayergbtn);
        prayergbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrayerGuidanceActivity();
            }
        });
        tasbihbtn= findViewById(R.id.tasbihbtn);
        tasbihbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTasbihActivity();
            }
        });
        nearestmosquebtn= findViewById(R.id.nearestmosquebtn);
        nearestmosquebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMosqueActivity();
            }
        });
        prayertimebtn= findViewById(R.id.prayertimebtn);
        prayertimebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrayerTimeActivity();
            }
        });
        pendingprayerbtn = findViewById(R.id.pendingprayerbtn);
        pendingprayerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openPendingPrayerActivity();
            }
        });
        namesbtn = findViewById(R.id.namesbtn);
        namesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openNamesActivity();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings){
            Intent intent = new Intent(DashboardActivity.this,FuzulActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void openNamesActivity() {
        Intent intent = new Intent(this, NamesOptionActivity.class);
        startActivity(intent);
    }

    private void openPendingPrayerActivity() {
        Intent intent = new Intent(this, PendingPrayerLayerActivity.class);
        startActivity(intent);
    }

    private void openPrayerTimeActivity() {
        Intent intent = new Intent(this, PrayerTimeActivity.class);
        startActivity(intent);
    }

    private void openMosqueActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    private void openTasbihActivity() {
        Intent intent = new Intent(this, TasbihOption.class);
        startActivity(intent);
    }

    private void openPrayerGuidanceActivity() {
        Intent intent = new Intent(this, ScrollableTabsActivity.class);
        startActivity(intent);
    }
}
