package com.dw.pattern.mediator;

public class BService implements IService{
    Registor registor;
    public BService() {
        registor.register("b",new BService());
    }
    @Override
    public void doSome() {

    }
}
