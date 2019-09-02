package com.areaofit.designpattern.behaviour.ObserverPattern.Event;

import lombok.Data;

import java.util.EventObject;

@Data
public class BellEvent extends EventObject {

    private boolean sound;

    public BellEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
