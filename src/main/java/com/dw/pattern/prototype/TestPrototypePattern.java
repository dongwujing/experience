package com.dw.pattern.prototype;

import com.alibaba.fastjson.JSON;

public class TestPrototypePattern {
    public static void main(String[] args) {
        Car car=new Car();
        car.setModel("bz");
        car.setName("car1");
        Engine engine=new Engine();
        engine.setName("汽油发动机");
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);
        Car car2= JSON.parseObject(JSON.toJSONString(car),Car.class);
        System.out.println(car2);
        System.out.println(car2.getEngine());
    }
}
