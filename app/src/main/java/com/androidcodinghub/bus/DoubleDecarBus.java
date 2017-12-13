package com.androidcodinghub.bus;

import android.util.Log;

/**
 * Created by ubuntu on 21/11/17.
 */

public class DoubleDecarBus extends Bus{

    private static DoubleDecarBus doubleDecarBus;
    private DoubleDecarBus(){}

    public static DoubleDecarBus getInstance(){
        if (doubleDecarBus==null){
            doubleDecarBus=new DoubleDecarBus();
            return doubleDecarBus;
        }
        return doubleDecarBus;

    }
    private static final String TAG = "DoubleDecarBus";
    @Override
    public void engine() {
        Log.e(TAG, "DoubleDecarBus started with engine 120" );
    }

    @Override
    public void totalSeat() {
        Log.e(TAG, "DoubleDecarBus has totalSeat: 100" );
    }

    @Override
    public void breaks() {
        Log.e(TAG, "DoubleDecarBus has breaks 3" );

    }
}
