package com.dw.pattern.observer.question;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        User u= (User) o;
        Question q= (Question) arg;
        System.out.println("收到消息");
    }
}
