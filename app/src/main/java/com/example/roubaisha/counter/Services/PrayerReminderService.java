package com.example.roubaisha.counter.Services;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.widget.Toast;

import com.example.roubaisha.counter.Helper.DatabaseHelper;
import com.example.roubaisha.counter.Helper.UIHelper;
import com.example.roubaisha.counter.HomeActivity;
import com.example.roubaisha.counter.NoResponse;
import com.example.roubaisha.counter.NotificationActionReceiver;
import com.example.roubaisha.counter.R;
import com.example.roubaisha.counter.StopAzaan;
import com.example.roubaisha.counter.YesResponse;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;

public class PrayerReminderService extends Service {

//    private final class ServiceHandler extends Handler {
//        public ServiceHandler(Looper looper) {
//            super(looper);
//        }
//        @Override
//        public void handleMessage(Message msg) {
//            // Normally we would do some work here, like download a file.
//            // For our sample, we just sleep for 5 seconds.
//            try {
//                Thread.sleep(500000000);
//            } catch (InterruptedException e) {
//                // Restore interrupt status.
//                Thread.currentThread().interrupt();
//            }
//            // Stop the service using the startId, so that we don't stop
//            // the service in the middle of handling another job
//            stopSelf(msg.arg1);
//        }
//    }

    private Timer timer;
    private TimerTask timerTask;
    int NOTIF_ID = 1;
    String ChannelId = "2";
    public int counter = 0;

//    private Looper serviceLooper;
//    private TravelDetectionService.ServiceHandler serviceHandler;

    private static Context context;
    private static DatabaseHelper db;
    NotificationActionReceiver objNotificationActionReceiver;

    public PrayerReminderService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        context = getApplicationContext();
        db = new DatabaseHelper(context);
        createNotificationChannel();
        PerformTask();
//        //BackgroundService
//        HandlerThread thread = new HandlerThread("ServiceStartArguments",
//                Process.THREAD_PRIORITY_URGENT_AUDIO);
//        thread.start();
//        // Get the HandlerThread's Looper and use it for our Handler
//        serviceLooper = thread.getLooper();
//        serviceHandler = new TravelDetectionService.ServiceHandler(serviceLooper);
//        Message msg = serviceHandler.obtainMessage();
//        msg.arg1 = startId;
//        serviceHandler.sendMessage(msg);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(objNotificationActionReceiver);
        super.onDestroy();
//        Intent broadcastIntent = new Intent("RestartPrayerReminderService");
//        sendBroadcast(broadcastIntent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void PerformTask() {
        UIHelper.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date currentTime = Calendar.getInstance().getTime();
                String timeFormatted = timeFormat.format(Date.parse(currentTime.toString()));
                String dateFormatted = dateFormat.format(Date.parse(currentTime.toString()));

                JSONObject objJSONObject = PrayerReminderService.db.GetPrayerTiming(timeFormatted);
//                JSONObject objJSONObject = PrayerReminderService.db.GetPrayerTiming("5:15 PM"); //Yeh dalna na bhulna timeFormatted

                if (objJSONObject != null) {
                    try {
                        GeneratePrayerReminder(objJSONObject.getInt("PrayerId"),
                                objJSONObject.getString("PrayerName"),
                                objJSONObject.getString("PrayerTime"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                objJSONObject = PrayerReminderService.db.GetPreviousPendingPrayer();
                if (objJSONObject != null) {
                    try {
                        GenerateQazaReminder(objJSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
//                Toast.makeText(PrayerReminderService.context, "Service Prayer Reminder Running", Toast.LENGTH_SHORT).show();
                PerformTask();

            }
        });
    }

    public void GeneratePrayerReminder(int PrayerId, String PrayerName, String PrayerTime) {
        Intent objNoIntent = new Intent(PrayerReminderService.context, NoResponse.class);
        Intent objYesIntent = new Intent(PrayerReminderService.context, YesResponse.class);
        Intent objpauseIntent = new Intent(PrayerReminderService.context, StopAzaan.class);
        objNoIntent.putExtra("ResponseTypeId", 0);
        objNoIntent.putExtra("PrayerId", PrayerId);

        PendingIntent objNoPendingIntent =
                PendingIntent.getActivity(PrayerReminderService.context, 1, objNoIntent, FLAG_UPDATE_CURRENT);
        PendingIntent objYesPendingIntent =
                PendingIntent.getActivity(PrayerReminderService.context, 1, objYesIntent, FLAG_UPDATE_CURRENT);
        PendingIntent objPausePendingIntent =
                PendingIntent.getActivity(PrayerReminderService.context, 1, objpauseIntent, FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(PrayerReminderService.context, ChannelId)
                        .setChannelId(ChannelId)
                        .setOngoing(true)
                        .setContentTitle("Prayer Alert - " + PrayerName)
                        .setContentText("It's " + PrayerTime + ". Time to offer " + PrayerName + ".")
                        .setSmallIcon(R.drawable.circle_icon)
                        .setContentIntent(objNoPendingIntent)
                        .setContentIntent(objYesPendingIntent)
                        .setContentIntent(objPausePendingIntent)
                        .addAction(R.drawable.circle_icon, "No, will perform later", objNoPendingIntent)
                        .addAction(R.drawable.circle_icon, "I'm Offering Salah", objYesPendingIntent)
                        .addAction(R.drawable.circle_icon, "Pause Azaan", objPausePendingIntent)
                        .setAutoCancel(true);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(PrayerReminderService.context);
        notificationManager.notify(NOTIF_ID, notificationBuilder.build());
        objNotificationActionReceiver = new NotificationActionReceiver();
        this.registerReceiver(objNotificationActionReceiver, new IntentFilter());
        Intent intent = new Intent(PrayerReminderService.this, SoundService.class);
        intent.putExtra("nameid", 2);
        startService(intent);
        //PostDelayed

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Yahan pe azan ke baad ki dua karwado play", Toast.LENGTH_LONG).show();//yaha py agya
                Intent intent = new Intent(PrayerReminderService.this, SoundService.class);//lakin ye nahi chala
                stopService(intent);
                intent.putExtra("nameid", 3);//azaan chalty chalty band hu jati ha sari services running services sy hat jati ha or cache services ma chali jati ha
                startService(intent);
            }//Date peechay karkay test karna
        }, 1000*180);
//aya main
    }

    public void GenerateQazaReminder(JSONObject objJSONObject) throws JSONException {
        Intent objNoIntent = new Intent(PrayerReminderService.context, NoResponse.class);
        Intent objYesIntent = new Intent(PrayerReminderService.context, YesResponse.class);
        objNoIntent.putExtra("ResponseTypeId", 1);
        objNoIntent.putExtra("PendingPrayerId", Integer.parseInt(objJSONObject.get("PendingPrayerId").toString()));

        objYesIntent.putExtra("ResponseTypeId", 1);
        objYesIntent.putExtra("PendingPrayerId", Integer.parseInt(objJSONObject.get("PendingPrayerId").toString()));

        PendingIntent objNoPendingIntent =
                PendingIntent.getActivity(PrayerReminderService.context, 1, objNoIntent, FLAG_UPDATE_CURRENT);
        PendingIntent objYesPendingIntent =
                PendingIntent.getActivity(PrayerReminderService.context, 1, objYesIntent, FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(PrayerReminderService.context, ChannelId)
                        .setChannelId(ChannelId)
                        .setOngoing(true)
                        .setContentTitle("Qaza Alert - " + objJSONObject.get("PrayerName").toString() + " [Only 30 Minutes left]")
                        .setContentText("Seems like you haven't performed " + objJSONObject.get("PrayerName").toString() + " today. Offer now ?")
                        .setSmallIcon(R.drawable.circle_icon)
                        .setContentIntent(objNoPendingIntent)
                        .setContentIntent(objYesPendingIntent)
                        .addAction(R.drawable.circle_icon, "No, will perform Qaza later", objNoPendingIntent)
                        .addAction(R.drawable.circle_icon, "I'm Offering Salah", objYesPendingIntent)
                        .setAutoCancel(true);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(PrayerReminderService.context);
        notificationManager.notify(NOTIF_ID, notificationBuilder.build());
        objNotificationActionReceiver = new NotificationActionReceiver();
        this.registerReceiver(objNotificationActionReceiver, new IntentFilter());
    }


    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "PrayerReminderChannel";
            String description = "PrayerReminderChannel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(ChannelId, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {

//        AlarmManager am=(AlarmManager)this.getSystemService(Context.ALARM_SERVICE);
//        Intent intent = new Intent(this, RestartPrayerReminderService.class);
//        intent.putExtra("Test", Boolean.TRUE);
//        PendingIntent pi = PendingIntent.getBroadcast(this, 0, intent, 0);
//        am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (1000), pi);
//        Intent restartService = new Intent(getApplicationContext(),
//                this.getClass());
//        restartService.setPackage(getPackageName());
//        PendingIntent restartServicePI = PendingIntent.getService(
//                getApplicationContext(), 1, restartService,
//                PendingIntent.FLAG_ONE_SHOT);
//        AlarmManager alarmService = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
//        alarmService.set(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime() + 1000, restartServicePI);
    }
}
