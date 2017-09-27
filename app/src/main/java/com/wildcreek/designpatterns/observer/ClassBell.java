package com.wildcreek.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public class ClassBell implements Subject{
    private List<Observer> observers;
    private boolean isChanged = false;
    private ClassBellType currentClassBell  = ClassBellType.BEGIN;
    public ClassBell(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }
    @Override
    public void setChanged(){
        this.isChanged = true;
    }

    @Override
    public void notifyObservers() {
        if(isChanged){
            for (Observer observer: observers) {
                observer.update();
            }
            isChanged = false;
        }
    }

    public void timePasses(){
        if(currentClassBell == ClassBellType.BEGIN){
            currentClassBell = ClassBellType.DISSMISS;
        }else {
            currentClassBell = ClassBellType.BEGIN;
        }
        notifyObservers();
    }
}
