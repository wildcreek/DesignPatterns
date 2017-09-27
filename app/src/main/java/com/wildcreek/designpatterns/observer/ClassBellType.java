package com.wildcreek.designpatterns.observer;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public enum  ClassBellType {
    BEGIN ,DISSMISS ;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
