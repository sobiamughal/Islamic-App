package com.example.roubaisha.counter.duaen;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.roubaisha.counter.R;

public class ListItemActivity4 extends AppCompatActivity {
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_activity_4);
        getSupportActionBar().setTitle("Dua when wake up from sleep  ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        play = (Button)findViewById(R.id.button_play);
        final MediaPlayer mP = MediaPlayer.create(ListItemActivity4.this, R.raw.msd);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP.isPlaying()){
                    mP.pause();
                    play.setBackgroundResource(R.drawable.play);
                }else {
                    mP.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
        });
    }
}