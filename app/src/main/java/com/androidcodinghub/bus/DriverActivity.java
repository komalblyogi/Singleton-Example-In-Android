package com.androidcodinghub.bus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DriverActivity extends AppCompatActivity {
    private static final String TAG = "DriverActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e(TAG, "Driver is going to start Mini Bus " );
        Vehicle bus=MiniBus.getInstance();
        startBus(bus);
        stopBus(bus);

        Log.e(TAG, "Driver is going to start RoadwaysBus " );
        bus=RoadwaysBus.getInstance();
        startBus(bus);
        stopBus(bus);

        Log.e(TAG, "Driver is going to start DoubleDecarBus " );
         bus=DoubleDecarBus.getInstance();
        startBus(bus);
        stopBus(bus);


    }

    private void startBus(Vehicle bus){
        bus.engine();
        bus.totalSeat();
    }

    private void stopBus(Vehicle bus){
        bus.breaks();
    }
}
