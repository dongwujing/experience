package com.dw.pattern.decorator;

import java.util.List;

/**
 * 用户权限
 */
public class UserPermission extends DecoratorPermission {

    public UserPermission(Permission permission) {
        super(permission);
    }


    @Override
    public List<Menu> showMenus() {
        menus.add(new Menu().builder().menuName("作业").build());
        menus.add(new Menu().builder().menuName("题库").build());
        menus.add(new Menu().builder().menuName("成长墙").build());
        return menus;
    }
}
