package com.androidcodinghub.bus;

import android.util.Log;

/**
 * Created by ubuntu on 21/11/17.
 */

public class RoadwaysBus extends Bus {

    private static RoadwaysBus roadwaysBus;
    private static final String TAG = "RoadwaysBus";

    private RoadwaysBus(){}
    public static RoadwaysBus getInstance(){
        if (roadwaysBus==null)
        {
            roadwaysBus=new RoadwaysBus();
            return roadwaysBus;
        }
        return roadwaysBus;
    }
    @Override
    public void engine() {
        Log.e(TAG, "RoadwaysBus started with engine 80" );
    }

    @Override
    public void totalSeat() {
        Log.e(TAG, "RoadwaysBus has totalSeat: 70" );
    }
}
