package com.dw.pattern.adapter.demo.passport.adapterv2;

import com.dw.pattern.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;
import com.dw.pattern.adapter.demo.passport.adapterv2.adapters.LoginForDouYinAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {

        ILogin4Third iLogin4Third=new Login4Third();
        iLogin4Third.login("100009",LoginForDouYinAdapter.class);

    }
}
