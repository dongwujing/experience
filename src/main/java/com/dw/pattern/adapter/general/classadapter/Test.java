package com.dw.pattern.adapter.general.classadapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
