package com.example.roubaisha.counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class TasbihActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*TextView title=(TextView)findViewById(R.id.tasbih_tv);
        title.setText("This is Activity Tasbeeh");*/

        /*Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);*/

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavView_Bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent0 = new Intent(TasbihActivity.this, HomeActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.ic_tasbih:
                        break;
                    case R.id.ic_more:
                        Intent intent2 = new Intent(TasbihActivity.this, MoreActivity.class);
                        startActivity(intent2);
                        break;
                }


                return false;
            }
        });

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.pinimg.com/originals/ad/54/e0/ad54e040ea009787770656c2a90c4341.jpg");
        mNames.add("Subhan Allah");

        mImageUrls.add("https://i.pinimg.com/originals/73/21/c4/7321c404ccfb6f601cf927de1be6db35.png");
        mNames.add("Alhumdulilah");

        mImageUrls.add("https://i.kym-cdn.com/photos/images/newsfeed/000/868/258/f7a.jpeg");
        mNames.add("Allah o Akbar");

        mImageUrls.add("https://maldivesindependent.com/files/2016/07/Screen-Shot-2016-07-14-at-09.31.11.png");
        mNames.add("Astagfirullah");


        mImageUrls.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjqpZLaqdXgAhU6DGMBHVmcDbcQjRx6BAgBEAU&url=https%3A%2F%2Fwww.kisspng.com%2Fpng-subhan-allah-god-in-islam-inshallah-vector-masjid-5261541%2F&psig=AOvVaw07_NkXdMUhBuqjaHj4GHFu&ust=1551130518185801");
        mNames.add("Subhan Allah");

        mImageUrls.add("https://i.pinimg.com/originals/73/21/c4/7321c404ccfb6f601cf927de1be6db35.png");
        mNames.add("Alhumdulilah");


        mImageUrls.add("https://maldivesindependent.com/files/2016/07/Screen-Shot-2016-07-14-at-09.31.11.png");
        mNames.add("Astagfirullah");

        mImageUrls.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjqpZLaqdXgAhU6DGMBHVmcDbcQjRx6BAgBEAU&url=https%3A%2F%2Fwww.kisspng.com%2Fpng-subhan-allah-god-in-islam-inshallah-vector-masjid-5261541%2F&psig=AOvVaw07_NkXdMUhBuqjaHj4GHFu&ust=1551130518185801");
        mNames.add("Subhan Allah");

        mImageUrls.add("https://i.kym-cdn.com/photos/images/newsfeed/000/868/258/f7a.jpeg");
        mNames.add("Allah o Akbar");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
