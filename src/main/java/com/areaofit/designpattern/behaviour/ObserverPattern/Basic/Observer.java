package com.areaofit.designpattern.behaviour.ObserverPattern.Basic;

/**
 * 观察者接口，定义相关方法
 */
public interface Observer {

    void prepare();

    void doing();

    void close();
}
