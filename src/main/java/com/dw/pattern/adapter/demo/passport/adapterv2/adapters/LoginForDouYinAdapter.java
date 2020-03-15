package com.dw.pattern.adapter.demo.passport.adapterv2.adapters;


import com.dw.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForDouYinAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForDouYinAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        return super.loginForRegist(id,null);

    }

}
