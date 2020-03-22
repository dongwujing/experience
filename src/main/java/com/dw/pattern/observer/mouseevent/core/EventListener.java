package com.dw.pattern.observer.mouseevent.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 被观察者抽象
 */
public class EventListener {
    protected Map<String,Event> events=new HashMap<>();

    public void addListener(String eventType, Object target, Method callback){
        events.put(eventType,new Event(target,callback));
    }
    public void addListener(String eventType, Object target){
        this.addListener(eventType,eventType,target,target.getClass().getMethod("on"+));
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        if (event.getCallback()!=null){
            try {
                event.getCallback().invoke(event.getTarget(),event);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    protected void trigger(String trigger){
        if (this.events.containsKey(trigger)){
            Event event= this.events.get(trigger);
            event.setTrigger(trigger);
            trigger(event);
        }
    }
}
