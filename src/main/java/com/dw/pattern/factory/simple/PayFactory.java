package com.dw.pattern.factory.simple;

import com.dw.pattern.factory.IPay;

public class PayFactory {
    IPay create(Class<? extends IPay> clzz) throws IllegalAccessException, InstantiationException {
        return clzz.newInstance();
    }
}
