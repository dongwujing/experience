package com.dw.pattern.decorator;

import java.util.List;

/**
 * 装饰器
 */
public abstract class DecoratorPermission implements Permission {
    protected List<Menu> menus;

    protected DecoratorPermission(Permission permission) {
        menus=permission.showMenus();
    }
}
