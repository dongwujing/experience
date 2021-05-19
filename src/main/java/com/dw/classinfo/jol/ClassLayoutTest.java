package com.dw.classinfo.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author mac
 */
public class ClassLayoutTest {
    public static void main(String[] args) {
        ClassLayoutTest classLayoutTest=new ClassLayoutTest();
        System.out.println(ClassLayout.parseInstance(classLayoutTest).toPrintable());
    }
}
