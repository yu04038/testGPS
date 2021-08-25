package com.example.test;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.location.LocationResult;

public class myLocationService extends BroadcastReceiver {

    public static final String ACTION_PROCESS_UPDATE = "com.example.test.UPDATE_LOCATION";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent != null) {
            final String action = intent.getAction();
            if(action.equals(ACTION_PROCESS_UPDATE)) {
                LocationResult result = LocationResult.extractResult(intent);
                if (result != null) {
                    Location location = result.getLastLocation();
                    String location_string = new StringBuilder("" + location.getLatitude())
                            .append("/")
                            .append(location.getLongitude())
                            .toString();
                    try {
                        MainActivity.getInstance().updateTextView(location_string);
                        Toast.makeText(context, location_string, Toast.LENGTH_SHORT).show();
                        Log.d("TEST-for", location_string);
                    } catch(Exception ex) {
                        Toast.makeText(context, location_string, Toast.LENGTH_SHORT).show();
                        Log.d("TEST-back", location_string);
                    }
                }
            }
        }
    }
}