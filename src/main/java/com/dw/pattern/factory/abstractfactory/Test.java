package com.dw.pattern.factory.abstractfactory;

import com.dw.pattern.factory.ICrossBorderPay;
import com.dw.pattern.factory.IPay;

public class Test {
    public static void main(String[] args) {
        AlipayPayFactory alipayPayFactory=new AlipayPayFactory();
        IPay pay= alipayPayFactory.createPay();
        pay.pay("1",100);
        ICrossBorderPay crossBorderPay= alipayPayFactory.createCrossBorderPay();
        crossBorderPay.crossBorderPay("2",200);
    }
}
