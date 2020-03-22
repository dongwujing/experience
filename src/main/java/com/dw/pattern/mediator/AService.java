package com.dw.pattern.mediator;

public class AService implements IService{
    Registor registor;
    public AService() {
        registor.register("a",new AService());
    }

    @Override
    public void doSome() {

    }
}
