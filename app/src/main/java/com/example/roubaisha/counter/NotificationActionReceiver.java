package com.example.roubaisha.counter;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class NotificationActionReceiver extends BroadcastReceiver {
    public static final String PERFORM_NOTIFICATION_BUTTON = "perform_notification_button";

    @Override
    public void onReceive(Context context, Intent intent) {
        String ResponsesId = intent.getStringExtra("ResponseId");
        String ResponseId = intent.getStringExtra("ResponseId");
        Intent it = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        context.sendBroadcast(it);
    }

}
