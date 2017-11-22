package com.wildcreek.designpatterns.adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/11/22.
 */

public class BoxPowerDevice {
    public void providePower(){
        Log.e("adapter" , "BoxPowerDevice is providing dc power ");
    }

    @Override
    public String toString() {
        return " a portable box power device";
    }
}
