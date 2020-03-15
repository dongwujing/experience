package com.dw.pattern.dutychain;

public class ValidateHandler extends DoHandler {
    @Override
    public ResponseBean handle(RequestBean requestBean) {
        System.out.println("校验参数");
        return null;
    }
}
