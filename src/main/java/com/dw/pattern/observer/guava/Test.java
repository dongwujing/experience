package com.dw.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

public class Test {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        eventBus.register(new GuavaEvent());
        eventBus.register(new MsgEvent());
        eventBus.post("hello");
        eventBus.post(new Msg());
    }
}
