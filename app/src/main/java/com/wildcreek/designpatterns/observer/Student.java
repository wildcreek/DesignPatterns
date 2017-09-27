package com.wildcreek.designpatterns.observer;

import android.util.Log;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public class Student implements Observer {
    @Override
    public void update() {
        Log.e("observer" , "class bell rings, students get ready for class");
    }
}
