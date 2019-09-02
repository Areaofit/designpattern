package com.areaofit.designpattern.behaviour.ObserverPattern;

import com.areaofit.designpattern.behaviour.ObserverPattern.Basic.ConcreteObserverOne;
import com.areaofit.designpattern.behaviour.ObserverPattern.Basic.ConcreteObserverTwo;
import com.areaofit.designpattern.behaviour.ObserverPattern.Basic.ConcreteSubject;
import com.areaofit.designpattern.behaviour.ObserverPattern.Basic.Subject;
import com.areaofit.designpattern.behaviour.ObserverPattern.Event.BellEventSource;
import com.areaofit.designpattern.behaviour.ObserverPattern.Event.StudentBellEventObserver;
import com.areaofit.designpattern.behaviour.ObserverPattern.Event.TeacherBellEventObserver;

public class A_main {

    public static void main(String[] args) {
        // 基本的观察者模式
        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserverOne());
        subject.add(new ConcreteObserverTwo());
        subject.prepare();

        // 基于事件驱动的观者模式
        BellEventSource bellEventSource = new BellEventSource();
        bellEventSource.add(new StudentBellEventObserver());
        bellEventSource.add(new TeacherBellEventObserver());
        bellEventSource.ring(true);
        System.out.println("\n");
        bellEventSource.ring(false);
    }
}
