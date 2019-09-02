package com.areaofit.designpattern.behaviour.ObserverPattern.Basic;

/**
 * 某个具体的观察者
 */
public class ConcreteObserverOne implements Observer {

    @Override
    public void prepare() {
        System.out.println("ConcreteObserverOne is preparing!");
    }

    @Override
    public void doing() {
        System.out.println("ConcreteObserverOne doing something!");
    }

    @Override
    public void close() {
        System.out.println("ConcreteObserverOne id closingss!");
    }
}
