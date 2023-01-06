package com.syc.study.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{
    @Override
    public HashMap method() {
        System.out.println("子类方法被执行");
        HashMap hashMap = new HashMap();
        hashMap.put("message", "子类方法被执行");
        return hashMap;
    }
}
