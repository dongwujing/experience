package com.dw.pattern.factory.abstractfactory;

import com.dw.pattern.factory.ICrossBorderPay;
import com.dw.pattern.factory.IPay;
import com.dw.pattern.factory.UnionCrossBorderPay;
import com.dw.pattern.factory.UnionPay;

public class UnionPayFactory implements IPayFactory {


    @Override
    public IPay createPay() {
        return new UnionPay();
    }

    @Override
    public ICrossBorderPay createCrossBorderPay() {
        return new UnionCrossBorderPay();
    }
}
