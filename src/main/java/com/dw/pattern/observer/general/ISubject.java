package com.dw.pattern.observer.general;

public interface ISubject {
    boolean add(IObserver observer);

    boolean del(IObserver observer);

    void  notifyObserver();
}
