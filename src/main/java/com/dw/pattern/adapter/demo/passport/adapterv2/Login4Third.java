package com.dw.pattern.adapter.demo.passport.adapterv2;

import com.dw.pattern.adapter.demo.passport.ResultMsg;
import com.dw.pattern.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;

public class Login4Third implements ILogin4Third {
    @Override
    public ResultMsg login(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
