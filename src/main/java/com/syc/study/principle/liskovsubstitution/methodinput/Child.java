package com.syc.study.principle.liskovsubstitution.methodinput;

import java.util.Map;

public class Child extends Base{
//    @Override
//    public void method(HashMap hashMap) {
//        System.out.println("子类重写父类的方法");
//    }

    public void method(Map map) {
        System.out.println("子类重载方法");
    }
}
