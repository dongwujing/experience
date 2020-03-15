package com.dw.pattern.decorator;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Permission permission=new BasePermission();
        System.out.println("默认权限"+ JSON.toJSONString(permission.showMenus()));
        Permission userPermission=new UserPermission(permission);
        System.out.println("用户权限"+ JSON.toJSONString(userPermission.showMenus()));
    }
}
