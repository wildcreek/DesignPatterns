package com.wildcreek.designpatterns.decorator;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public class PineChristmasTree extends ChristmasTree{
    @Override
    public String display() {
        return "a pine Christmas tree";
    }

    @Override
    public double cost() {
        return 100.00;
    }
}
