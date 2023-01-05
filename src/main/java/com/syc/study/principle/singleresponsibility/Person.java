package com.syc.study.principle.singleresponsibility;

public class Person {
    public void speak(String people) {
        if("英国人".equals(people)) {
            System.out.println(people + "说英语");
        }else{
            System.out.println(people + "说普通话");
        }
    }
}
