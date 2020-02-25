package com.dw.pattern.factory.method;

import com.dw.pattern.factory.AliPay;
import com.dw.pattern.factory.IPay;

public class AlipayPayFactory implements IPayFactory {
    @Override
    public IPay create() {
        return new AliPay();
    }
}
