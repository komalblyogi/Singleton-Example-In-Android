package com.androidcodinghub.bus;

import android.util.Log;

/**
 * Created by ubuntu on 21/11/17.
 */

public abstract class Bus implements Vehicle {
    private static final String TAG = "Bus";


    @Override
    public void breaks() {
        Log.e(TAG, ""+getClass().getSimpleName()+" has 2 breaks: " );
    }

    @Override
    public abstract void engine() ;

    @Override
    public abstract void totalSeat();


}
