package com.areaofit.designpattern.behaviour.StrategyPattern;

import lombok.Data;

@Data
public class ContextClass {

    private Strategy strategy;

    public void strategy() {
        this.strategy.doingSomething();
    }
}
