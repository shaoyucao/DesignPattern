package com.syc.study.pattern.creational.singleton;

public class LazySingleton {
    private LazySingleton() {

    }

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
