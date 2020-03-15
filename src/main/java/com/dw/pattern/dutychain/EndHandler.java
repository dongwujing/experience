package com.dw.pattern.dutychain;

public class EndHandler extends DoHandler {
    @Override
    public ResponseBean handle(RequestBean requestBean) {
        System.out.println("销毁工作");
        return null;
    }
}
