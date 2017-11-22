package com.wildcreek.designpatterns.adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/11/22.
 */

public class PowerOutlet implements ACPowerSource {
    @Override
    public void provideACPower() {
        Log.e("adapter" , "PowerOutlet is providing ac power ");
    }
}
