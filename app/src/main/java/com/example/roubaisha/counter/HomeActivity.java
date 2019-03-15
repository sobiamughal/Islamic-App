package com.example.roubaisha.counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavView_Bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:

                        break;
                    case R.id.ic_tasbih:
                        Intent intent1 = new Intent(HomeActivity.this, TasbihActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_prayerg:
                        Intent intent2 = new Intent(HomeActivity.this, PrayerGuidance.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_more:
                        Intent intent3 = new Intent(HomeActivity.this, MoreActivity.class);
                        startActivity(intent3);
                        break;
                }


                return false;
            }
        });
    }
}
