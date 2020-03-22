package com.dw.pattern.observer.general;

public class Observer implements IObserver {
    @Override
    public void update() {
        System.out.println("update");
    }
}
