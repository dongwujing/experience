package com.dw.pattern.factory;
/**
 * @Description:
 * @author dongwj
 * @date 2020/2/25 
 */
public  interface IPay {
    /**
     * 支付
     * @param id
     * @param amount
     */
    public abstract void pay(String id, Integer amount);
}
