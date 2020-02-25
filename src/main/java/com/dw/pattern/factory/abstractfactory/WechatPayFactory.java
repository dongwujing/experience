package com.dw.pattern.factory.abstractfactory;

import com.dw.pattern.factory.ICrossBorderPay;
import com.dw.pattern.factory.IPay;
import com.dw.pattern.factory.WechatCrossBorderPay;
import com.dw.pattern.factory.WechatPay;

public class WechatPayFactory implements IPayFactory {


    @Override
    public IPay createPay() {
        return new WechatPay();
    }

    @Override
    public ICrossBorderPay createCrossBorderPay() {
        return new WechatCrossBorderPay();
    }
}
