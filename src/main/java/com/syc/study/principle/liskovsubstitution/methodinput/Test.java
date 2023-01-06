package com.syc.study.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Child child = new Child();
        child.method(hashMap);
    }
}
