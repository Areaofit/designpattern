package com.areaofit.designpattern.behaviour.ObserverPattern.Basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 */
public abstract class Subject implements Observer {

    List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

}
