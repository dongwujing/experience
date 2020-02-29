package com.dw.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }
    private static Map<String,Object> ioc=  new ConcurrentHashMap<>();

    public static Object getInstance(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object inst=null;
        //加锁保证线程安全
        synchronized (ioc){
            if (!ioc.containsKey(name)){
                if (inst==null){
                    inst=Class.forName(name).newInstance();
                    ioc.put(name,inst);
                }
            }else {
                inst=ioc.get(name);
            }
        }
        return inst;
    }
}
