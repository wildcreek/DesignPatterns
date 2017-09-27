package com.wildcreek.designpatterns.decorator;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public class Candy extends ChristmasTreeDecorator{
    private ChristmasTree christmasTree;
    public Candy(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }
    @Override
    public String display() {
        return christmasTree.display() + " decorated with candy";
    }

    @Override
    public double cost() {
        return christmasTree.cost() + 5;
    }
}
