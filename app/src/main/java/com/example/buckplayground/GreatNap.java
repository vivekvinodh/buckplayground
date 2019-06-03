package com.example.buckplayground;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GreatNap extends Service {
    public GreatNap() {
        //create a great nap
        //release great nap is ready
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
