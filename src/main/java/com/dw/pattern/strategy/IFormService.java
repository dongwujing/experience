package com.dw.pattern.strategy;

import java.util.List;

public interface IFormService {
    /**
     * 生成动态表单组件
     * @param id
     * @return
     */
    List<InputCompantent> generate(String id);
}
