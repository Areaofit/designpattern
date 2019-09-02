package com.areaofit.designpattern.behaviour.ObserverPattern.Event;

import java.util.ArrayList;
import java.util.List;

public class BellEventSource {

    private List<BellEventObserver> observers = new ArrayList<>();

    public void add(BellEventObserver observer) {
        observers.add(observer);
    }

    /**
     * 开始打铃
     * @param sound
     */
    public void ring(boolean sound) {
        String str = sound?"上课铃响！":"上课铃响！";
        System.out.println(str);
        BellEvent bellEvent = new BellEvent(this, sound);
        notifyObservers(bellEvent);
    }

    public void notifyObservers(BellEvent event) {
        for (BellEventObserver observer : observers) {
            observer.listenBell(event);
        }
    }
}
