package com.dw.pattern.strategy;

import java.util.List;

public class FormForChannelAService implements IFormService {
    @Override
    public List<InputCompantent> generate(String id) {
        System.out.println("a渠道动态表单");
        return null;
    }
}
