package com.dw.pattern.observer.general;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private List<IObserver> list=new ArrayList<>();
    @Override
    public boolean add(IObserver observer) {
        return list.add(observer);
    }

    @Override
    public boolean del(IObserver observer) {
        return list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        list.stream().forEach(it->{it.update(); });
    }
}
