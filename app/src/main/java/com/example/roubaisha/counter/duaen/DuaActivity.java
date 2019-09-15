package com.example.roubaisha.counter.duaen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.roubaisha.counter.R;

public class DuaActivity extends AppCompatActivity
{
    private CardView CvMsdua;
    private CardView CvMordua;
    private CardView CvEvedua;
    private CardView CvAftdua;
    private CardView CvBefdua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        getSupportActionBar().setTitle("Duas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CvMsdua=(CardView)findViewById(R.id. CvMsdua);
        CvMsdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusnoonActivity();
            }
        });
        CvMordua=(CardView)findViewById(R.id. CvMordua);
        CvMordua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMorningActivity();
            }
        });
        CvEvedua=(CardView)findViewById(R.id. CvEvedua);
        CvEvedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEveningActivity();
            }
        });
        CvAftdua=(CardView)findViewById(R.id. CvAftdua);
        CvAftdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAfternActivity();
            }
        });
        CvBefdua=(CardView)findViewById(R.id. CvBefdua);
        CvBefdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeforesActivity();
            }
        });

}
    public void openMusnoonActivity(){
        Intent intent = new Intent(DuaActivity.this, MusnoonActivity.class);
        startActivity(intent);
    }
    public void openMorningActivity(){
        Intent intent = new Intent(DuaActivity.this, MorningActivity.class);
        startActivity(intent);
    }
    public void openEveningActivity(){
        Intent intent = new Intent(DuaActivity.this, EveningActivity.class);
        startActivity(intent);
    }
    public void openAfternActivity(){
        Intent intent = new Intent(DuaActivity.this,AfternActivity.class);
        startActivity(intent);
    }
    public void openBeforesActivity(){
        Intent intent = new Intent(DuaActivity.this, BeforesActivity.class);
        startActivity(intent);
    }
}
