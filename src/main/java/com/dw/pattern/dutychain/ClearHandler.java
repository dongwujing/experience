package com.dw.pattern.dutychain;

public class ClearHandler extends DoHandler {
    @Override
    public ResponseBean handle(RequestBean requestBean) {
        System.out.println("扫尾工作");
        return null;
    }
}
