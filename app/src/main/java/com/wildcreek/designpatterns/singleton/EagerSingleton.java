package com.wildcreek.designpatterns.singleton;

/**
 * Created by Administrator on 2017/11/2 0002.
 */

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return  instance;
    }
}
