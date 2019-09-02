package com.areaofit.designpattern.behaviour.ObserverPattern.Event;

public class TeacherBellEventObserver implements BellEventObserver {

    @Override
    public void listenBell(BellEvent event) {
        if (event.getSound()) {
            System.out.println("老师开始讲课");
        } else {
            System.out.println("老师开始下课");
        }
    }
}
