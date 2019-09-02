package com.areaofit.designpattern.behaviour.StrategyPattern;

public class ConcreteStrategyOne implements Strategy {

    @Override
    public void doingSomething() {
        System.out.println("ConcreteStrategyOne created");
    }
}
