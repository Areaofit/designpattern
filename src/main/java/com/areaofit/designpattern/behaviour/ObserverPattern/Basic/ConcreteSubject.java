package com.areaofit.designpattern.behaviour.ObserverPattern.Basic;

/**
 * 具体的目标（被观察的对象）
 */
public class ConcreteSubject extends Subject {

    @Override
    public void prepare() {
        for (Observer observer : observers) {
            observer.prepare();
        }
    }

    @Override
    public void doing() {
        for (Observer observer : observers) {
            observer.prepare();
        }
    }

    @Override
    public void close() {
        for (Observer observer : observers) {
            observer.prepare();
        }
    }
}
