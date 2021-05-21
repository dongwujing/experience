package com.dw.jvm;
// v0版本
import java.lang.reflect.Method;

/**
 * 反射调用
 * 本地实现 性能差
 * 动态实现
 * @author dong
 */
public class Test {
  public static void target(int i) {
    System.out.println("执行target");
    new Exception("#" + i).printStackTrace();
  }

  public static void main(String[] args) throws Exception {
    Class<?> klass = Class.forName("com.dw.jvm.Test");
    Method method = klass.getMethod("target", int.class);
    method.invoke(null, 0);
  }
}

//# 不同版本的输出略有不同，这里我使用了Java 10。
//$ java Test
//java.lang.Exception: #0
//        at Test.target(Test.java:5)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl .invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl. .invoke(NativeMethodAccessorImpl.java:62)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.i .invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:564)
//        at Test.main(Test.java:131
