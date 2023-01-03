package com.syc.study.principle.dependenceinversion;

public class StudyJavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习 Java");
    }
}
