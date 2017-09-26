package com.wildcreek.designpatterns.strategy;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class Fisherman {
    private FishingStrategy fishStrategy ;
    public Fisherman(FishingStrategy fishStrategy) {
        this.fishStrategy = fishStrategy;
    }
    public void changeStrategy(FishingStrategy fishStrategy){
        this.fishStrategy = fishStrategy;
    }
    public void startFishing(){
        fishStrategy.fishing();
    }
}
