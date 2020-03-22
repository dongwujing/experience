package com.dw.pattern.observer.question;

import java.util.Observable;

/**
 * 被观察者
 */
public class User  extends Observable {
    private String uname="观察者模式论坛";
    private static  final  User u=new User();

    public User() {
    }

    public static  User getInstance(){
        return u;
    }

    public void publishQuestion(Question question){
        setChanged();
        notifyObservers(question);
    }

}
