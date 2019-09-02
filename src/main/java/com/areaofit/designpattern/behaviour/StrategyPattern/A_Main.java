package com.areaofit.designpattern.behaviour.StrategyPattern;

public class A_Main {

    public static void main(String[] args) {
        ContextClass contextClass = new ContextClass();
        Strategy strategy = new ConcreteStrategyOne();
        contextClass.setStrategy(strategy);
        contextClass.strategy();

        contextClass.setStrategy(new ConcreteStrategyTwo());
        contextClass.strategy();
    }
}
