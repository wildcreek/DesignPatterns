package com.wildcreek.designpatterns.singleton;

/**
 * Created by Administrator on 2017/11/2 0002.
 */

public class LazySingletonDoubleCheck {
    private LazySingletonDoubleCheck(){
    }
    private volatile static  LazySingletonDoubleCheck instance ;
    public static final LazySingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (LazySingletonDoubleCheck.class){
                if(instance == null ){
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
