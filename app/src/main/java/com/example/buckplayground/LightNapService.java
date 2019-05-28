package com.example.buckplayground;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LightNapService extends Service {
    public LightNapService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
