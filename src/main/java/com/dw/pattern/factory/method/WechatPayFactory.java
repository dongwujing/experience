package com.dw.pattern.factory.method;

import com.dw.pattern.factory.IPay;
import com.dw.pattern.factory.WechatPay;

public class WechatPayFactory implements IPayFactory {
    @Override
    public IPay create() {
        return new WechatPay();
    }
}
