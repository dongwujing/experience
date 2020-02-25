package com.dw.pattern.factory.simple;

import com.dw.pattern.factory.IPay;
import com.dw.pattern.factory.WechatPay;

public class PayTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IPay IPayService = new PayFactory().create(WechatPay.class);
        IPayService.pay("11",10);
    }
}
