package com.wildcreek.designpatterns.singleton;

/**
 * Created by Administrator on 2017/11/2 0002.
 */

public class LazySingletonStaticInner {
    private LazySingletonStaticInner(){
    }
    private static class SingletonHolder {
        public static final LazySingletonStaticInner INSTANCE = new LazySingletonStaticInner();
    }
    public static final LazySingletonStaticInner getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
