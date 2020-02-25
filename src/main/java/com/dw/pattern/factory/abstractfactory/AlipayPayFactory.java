package com.dw.pattern.factory.abstractfactory;

import com.dw.pattern.factory.AliCrossBorderPay;
import com.dw.pattern.factory.AliPay;
import com.dw.pattern.factory.ICrossBorderPay;
import com.dw.pattern.factory.IPay;

public class AlipayPayFactory implements IPayFactory {


    @Override
    public IPay createPay() {
        return new AliPay();
    }

    @Override
    public ICrossBorderPay createCrossBorderPay() {
        return new AliCrossBorderPay();
    }
}
