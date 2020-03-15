package com.dw.pattern.decorator;

import java.util.List;

/**
 * 权限接口
 */
public interface  Permission {

    public abstract List<Menu> showMenus() ;
}
