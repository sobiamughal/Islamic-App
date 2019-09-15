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

public class EveningActivity extends AppCompatActivity
{
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        getSupportActionBar().setTitle("Evening Remembrance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mea, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mea);
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
                stopAndPlay(R.raw.meb, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.meb);
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
                stopAndPlay(R.raw.mec, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mec);
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
                stopAndPlay(R.raw.med, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.med);
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
                stopAndPlay(R.raw.mee, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mee);
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
                stopAndPlay(R.raw.mef, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mef);
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
                stopAndPlay(R.raw.meg, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.meg);
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
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.meh, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.meh);
                    mediaPlayer.start();
                    flag++;
                    button8.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button8.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mei, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mei);
                    mediaPlayer.start();
                    flag++;
                    button9.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button9.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mej, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mej);
                    mediaPlayer.start();
                    flag++;
                    button10.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button10.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mek, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mek);
                    mediaPlayer.start();
                    flag++;
                    button11.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button11.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mel, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mel);
                    mediaPlayer.start();
                    flag++;
                    button12.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button12.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mem, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mem);
                    mediaPlayer.start();
                    flag++;
                    button13.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button13.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.men, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.men);
                    mediaPlayer.start();
                    flag++;
                    button14.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button14.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.meo, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.meo);
                    mediaPlayer.start();
                    flag++;
                    button15.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button15.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mep, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mep);
                    mediaPlayer.start();
                    flag++;
                    button16.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button16.setBackgroundResource(R.drawable.play);
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

