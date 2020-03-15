package com.dw.pattern.strategy;

import java.util.List;

public class FormForChannelCService implements IFormService {
    @Override
    public List<InputCompantent> generate(String id) {
        System.out.println("c渠道动态表单");
        return null;
    }
}
