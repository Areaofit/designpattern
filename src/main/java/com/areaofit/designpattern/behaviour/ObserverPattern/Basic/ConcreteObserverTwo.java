package com.areaofit.designpattern.behaviour.ObserverPattern.Basic;

/**
 * 某个具体的观察者
 */
public class ConcreteObserverTwo implements Observer {

    @Override
    public void prepare() {
        System.out.println("ConcreteObserverTwo is preparing!");
    }

    @Override
    public void doing() {
        System.out.println("ConcreteObserverTwo doing something!");
    }

    @Override
    public void close() {
        System.out.println("ConcreteObserverTwo id closingss!");
    }
}
