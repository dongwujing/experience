package com.dw.pattern.adapter.demo.passport.adapterv2;

import com.dw.pattern.adapter.demo.passport.ResultMsg;
import com.dw.pattern.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;

public interface ILogin4Third {
    ResultMsg login(String id,Class<? extends ILoginAdapter> clazz);
}
