package com.dw.pattern.factory.method;

import com.dw.pattern.factory.IPay;
import com.dw.pattern.factory.UnionPay;

public class UnionPayFactory implements IPayFactory {
    @Override
    public IPay create() {
        return new UnionPay();
    }
}
