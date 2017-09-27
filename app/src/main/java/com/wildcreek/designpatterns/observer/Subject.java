package com.wildcreek.designpatterns.observer;

/**
 * Created by Administrator on 2017/9/27 0027.
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setChanged();
}
