package com.wildcreek.designpatterns.adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/11/22.
 */

public class TVBox {

    public void connectPower(BoxPowerDevice boxPowerDevice){
        Log.e("adapter" , "TVBox is plugging for " + boxPowerDevice.toString());
        boxPowerDevice.providePower();
    }
}
