package com.dw.pattern.dutychain;

public class Test {
    public static void main(String[] args) {
        DoHandler clearHandler=new ClearHandler();
        DoHandler validater=new ValidateHandler();
        DoHandler endHandler=new EndHandler();
//        validater.setNext(clearHandler);
//        ResponseBean responseBean=new ResponseBean();
        RequestBean requestBean=new RequestBean();
//        responseBean =validater.doit(requestBean);
        DoHandler.Builder builder=new DoHandler.Builder();
        builder.addHandler(validater);
        builder.addHandler(clearHandler);
        builder.addHandler(endHandler);
        DoHandler doHandler= builder.build();
        doHandler.doit(requestBean);
    }
}
