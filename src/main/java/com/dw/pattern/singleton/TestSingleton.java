package com.dw.pattern.singleton;

public class TestSingleton {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object obj1= ContainerSingleton.getInstance("com.dw.pattern.singleton.Person");
        Object obj2= ContainerSingleton.getInstance("com.dw.pattern.singleton.Person");
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
