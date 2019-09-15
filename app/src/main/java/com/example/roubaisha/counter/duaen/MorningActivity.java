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

public class MorningActivity extends AppCompatActivity
{
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        getSupportActionBar().setTitle("Morning Remembrance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer mediaPlayer = new MediaPlayer();
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moa, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moa);
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
                stopAndPlay(R.raw.mob, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mob);
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
                stopAndPlay(R.raw.moc, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moc);
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
                stopAndPlay(R.raw.mod, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mod);
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
                stopAndPlay(R.raw.moe, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moe);
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
                stopAndPlay(R.raw.mof, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mof);
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
                stopAndPlay(R.raw.mog, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mog);
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
                stopAndPlay(R.raw.moh, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moh);
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
                stopAndPlay(R.raw.moi, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moi);
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
                stopAndPlay(R.raw.moj, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moj);
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
                stopAndPlay(R.raw.mok, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mok);
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
                stopAndPlay(R.raw.mol, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mol);
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
                stopAndPlay(R.raw.mom, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mom);
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
                stopAndPlay(R.raw.mon, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mon);
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
                stopAndPlay(R.raw.moo, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.moo);
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
                stopAndPlay(R.raw.mop, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mop);
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
        final Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.moq, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mog);
                    mediaPlayer.start();
                    flag++;
                    button17.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button17.setBackgroundResource(R.drawable.play);
                }
            }
        });
        final Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAndPlay(R.raw.mor, mediaPlayer);
                if (flag == 0) {

                    Log.v("Inside if", "Success" + "");
                    MediaPlayer.create(getApplicationContext(),
                            R.raw.mor);
                    mediaPlayer.start();
                    flag++;
                    button18.setBackgroundResource(R.drawable.pause);
                } else {
                    Log.v("Inside else", "Success" + "");
                    mediaPlayer.stop();
                    flag = 0;
                    button18.setBackgroundResource(R.drawable.play);
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

