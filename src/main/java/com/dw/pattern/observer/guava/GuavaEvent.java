package com.dw.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void observer(String  content){
            System.out.println("content = " + content);
    }
}
