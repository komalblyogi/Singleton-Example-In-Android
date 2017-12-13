package com.androidcodinghub.bus;

import android.util.Log;

/**
 * Created by ubuntu on 21/11/17.
 */

public class MiniBus extends Bus{

    private static MiniBus miniBus;
    private MiniBus(){

    }
    public static MiniBus getInstance(){
        if (miniBus==null){
            miniBus=new MiniBus();
            Log.e(TAG, "minibus object created: " );
            return miniBus;
        }
       return miniBus;
    }

    private static final String TAG = "MiniBus";

    @Override
    public void engine() {
        Log.e(TAG, "MiniBus started with engine 50" );
    }

    @Override
    public void totalSeat() {
        Log.e(TAG, "MiniBus has totalSeat: 50" );
    }
}
