package com.example.roubaisha.counter.duaen;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.roubaisha.counter.Helper.DatabaseHelper;
import com.example.roubaisha.counter.Helper.PrayerAPIHelper;
import com.example.roubaisha.counter.MoreActivity;
import com.example.roubaisha.counter.PrayerGuidance;
import com.example.roubaisha.counter.R;
import com.example.roubaisha.counter.Services.PrayerReminderService;
import com.example.roubaisha.counter.Services.RestartPrayerReminderService;
import com.example.roubaisha.counter.Services.RestartTravelDetectionService;
import com.example.roubaisha.counter.Services.TravelDetectionService;
import com.example.roubaisha.counter.TasbihActivity;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    String[] listitem;

    private static final long START_TIME_IN_MILLIS = 1800000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;

    private CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;

    private long mTimeLeftInMillis;
    private long mEndTime;

    DatabaseHelper objDBHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        mButtonReset = findViewById(R.id.button_reset);

//        int ResponseId = this.getIntent().getIntExtra("Response", -1);
//        if(ResponseId != -1)
//        {
//            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
//            homeIntent.addCategory( Intent.CATEGORY_HOME );
//            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(homeIntent);
//            System.exit(0);
//        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

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

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        PrayerAPIHelper.RetrievePrayerTimings(this);
        showStartDialog();
        updateCountDownText();

        if (!isMyServiceRunning(PrayerReminderService.class)) {

            RestartPrayerReminderService objRestartPrayerReminderService = new RestartPrayerReminderService();
            this.registerReceiver(objRestartPrayerReminderService, new IntentFilter());
            Intent intent = new Intent(this, RestartPrayerReminderService.class);
            sendBroadcast(intent);
        }
        if (!isMyServiceRunning(TravelDetectionService.class)) {

            RestartTravelDetectionService objRestartTravelDetectionService = new RestartTravelDetectionService();
            this.registerReceiver(objRestartTravelDetectionService, new IntentFilter());
            Intent intent = new Intent(this, RestartTravelDetectionService.class);
            sendBroadcast(intent);
        }
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
        mNotificationManager.cancel(2);

    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putLong("millisLeft", mTimeLeftInMillis);
        editor.putBoolean("timerRunning", mTimerRunning);
        editor.putLong("endTime", mEndTime);

        editor.apply();

        if (mCountDownTimer != null) {
            mCountDownTimer.cancel();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);

        mTimeLeftInMillis = prefs.getLong("millisLeft", START_TIME_IN_MILLIS);
        mTimerRunning = prefs.getBoolean("timerRunning", false);

        updateCountDownText();
        updateButtons();

        if (mTimerRunning) {
            mEndTime = prefs.getLong("endTime", 0);
            mTimeLeftInMillis = mEndTime - System.currentTimeMillis();

            if (mTimeLeftInMillis < 0) {
                mTimeLeftInMillis = 0;
                mTimerRunning = false;
                updateCountDownText();
                updateButtons();
            } else {
                startTimer();
            }
        }
    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        ActivityManager activityManager = (ActivityManager) getApplicationContext()
//                .getSystemService(Context.ACTIVITY_SERVICE);
//
//        activityManager.moveTaskToFront(getTaskId(), 0);
//    }

    private void showStartDialog() {
        listitem = new String[]{"Muslim", "Muslimah"};
        new AlertDialog.Builder(this)
                .setTitle("Select Gender")
                .setSingleChoiceItems(listitem, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (mTimerRunning) {
                            pauseTimer();
                        } else {
                            startTimer();
                        }
                        dialog.dismiss();
                    }
                }).create().show();


        //SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        //SharedPreferences.Editor editor = prefs.edit();
        //editor.putBoolean("firstStart", false);
        // editor.apply();
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        mTextViewCountDown.setText(timeLeftFormatted);
    }

    private void startTimer() {
        mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;

        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                updateButtons();
            }
        }.start();

        mTimerRunning = true;
        updateButtons();
    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        updateButtons();

    }

    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        updateButtons();
    }

    private void updateButtons() {
        if (mTimerRunning) {
            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setText("Pause");
        } else {
            mButtonStartPause.setText("Start");

            if (mTimeLeftInMillis < 1000) {
                mButtonStartPause.setVisibility(View.INVISIBLE);
            } else {
                mButtonStartPause.setVisibility(View.INVISIBLE);
            }

            if (mTimeLeftInMillis < START_TIME_IN_MILLIS) {
                mButtonReset.setVisibility(View.INVISIBLE);
            } else {
                mButtonReset.setVisibility(View.INVISIBLE);
            }
        }
    }

    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
