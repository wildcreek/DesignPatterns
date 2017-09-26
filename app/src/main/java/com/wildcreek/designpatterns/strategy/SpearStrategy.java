package com.wildcreek.designpatterns.strategy;

import android.util.Log;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class SpearStrategy implements FishingStrategy{
    @Override
    public void fishing() {
        Log.e("strategy","fishing with spear");
    }
}
