package com.example.roubaisha.counter.duaen;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.roubaisha.counter.R;

import java.io.IOException;

public class BeforesActivity extends AppCompatActivity
{
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before);
        getSupportActionBar().setTitle("Before Sleeping");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsa, mediaPlayer);
                if (flag == 0) {
                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsa);
                    mediaPlayer.start();
                    flag++;
                    button1.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button1.setBackgroundResource(R.drawable.play);
                }



            }

        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsb, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsb);
                    mediaPlayer.start();
                    flag++;
                    button2.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button2.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsc, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsc);
                    mediaPlayer.start();
                    flag++;
                    button3.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button3.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsd, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsd);
                    mediaPlayer.start();
                    flag++;
                    button4.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button4.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bse, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bse);
                    mediaPlayer.start();
                    flag++;
                    button5.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button5.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsf, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsf);
                    mediaPlayer.start();
                    flag++;
                    button6.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button6.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.bsg, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.bsg);
                    mediaPlayer.start();
                    flag++;
                    button7.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button7.setBackgroundResource(R.drawable.play);
                }
            }
        });

    }

    private void stopAndPlay(int rawId, MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
        AssetFileDescriptor afd = this.getResources().openRawResourceFd(rawId);
        try {
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
    }

}

