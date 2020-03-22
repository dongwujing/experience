package com.dw.pattern.observer.mouseevent.core;

import lombok.Data;

import java.lang.reflect.Method;
@Data
public class Event {

    //事件源
    private Object source;
    //事件触发通知谁
    private Object target;
    //回应
    private Method callback;
    //触发事件
    private String trigger;
    //触发事件
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }
}
