package com.dw.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本实现
 */
public class BasePermission implements Permission {
    @Override
    public List<Menu> showMenus() {
        List<Menu> menus= new ArrayList<>();
        menus.add(new Menu().builder().menuName("问答").build());
        menus.add(new Menu().builder().menuName("文章").build());
        menus.add(new Menu().builder().menuName("精品课").build());
        menus.add(new Menu().builder().menuName("冒泡").build());
        menus.add(new Menu().builder().menuName("商城").build());
        return menus ;
    }
}
