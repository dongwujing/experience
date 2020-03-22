package com.dw.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class MsgEvent {

    @Subscribe
    public void observer(Msg content){
            System.out.println("msgEvent:"+ content.toString());
    }
}
