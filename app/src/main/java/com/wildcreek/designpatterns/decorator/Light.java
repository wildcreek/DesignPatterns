package com.wildcreek.designpatterns.decorator;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public class Light extends ChristmasTreeDecorator {
    private ChristmasTree christmasTree;
    public Light(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }
    @Override
    public String display() {
        return christmasTree.display() + " decorated with lights ";
    }

    @Override
    public double cost() {
        return christmasTree.cost() + 10;
    }
}
