package com.dw.pattern.dutychain;


import java.util.Map;

public abstract class DoHandler {
    private DoHandler next;

    public void setNext(DoHandler next) {
        this.next = next;
    }
    public abstract ResponseBean handle(RequestBean requestBean);

    public  ResponseBean  doit(RequestBean requestBean){
        ResponseBean responseBean=null;
        handle(requestBean);
        if (next!=null){
            responseBean=next.doit(requestBean);
        }
        return responseBean;
    }

    public static class Builder{
        DoHandler head=null;
        DoHandler rear=null;
         public  Builder addHandler(DoHandler doHandler){
             if (head==null){
                 head=rear=doHandler;
                 return this;
             }
             rear.next=doHandler;
             rear=doHandler;
             return this;
         }

         public DoHandler build(){
            return head;
         }
    }

}
