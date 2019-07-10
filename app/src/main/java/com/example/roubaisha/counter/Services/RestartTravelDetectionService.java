package com.example.roubaisha.counter.Services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RestartTravelDetectionService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, TravelDetectionService.class));
    }
}
