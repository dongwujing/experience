package com.dw.pattern.mediator;

public class CService implements IService{
    Registor registor;
    public CService() {
        registor.register("c",new CService());
    }
    @Override
    public void doSome() {
        registor.getService("a").doSome();
    }
}
