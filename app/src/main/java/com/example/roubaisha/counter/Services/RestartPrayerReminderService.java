package com.example.roubaisha.counter.Services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RestartPrayerReminderService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, PrayerReminderService.class));
    }

}