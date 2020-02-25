package com.dw.pattern.factory.abstractfactory;

import com.dw.pattern.factory.ICrossBorderPay;
import com.dw.pattern.factory.IPay;

public  interface IPayFactory {
    IPay createPay();
    ICrossBorderPay createCrossBorderPay();
}
