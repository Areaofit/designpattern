package com.areaofit.designpattern.behaviour.ObserverPattern.Event;

public class StudentBellEventObserver implements BellEventObserver{

    @Override
    public void listenBell(BellEvent event) {
        if (event.getSound()) {
            System.out.println("学生们开始上课");
        } else {
            System.out.println("学生们开始下课");
        }
    }
}
