package com.dw.pattern.strategy;

import java.util.List;

public class FormForChannelBService implements IFormService {
    @Override
    public List<InputCompantent> generate(String id) {
        System.out.println("b渠道动态表单");
        return null;
    }
}
