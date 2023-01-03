package com.syc.study.principle.dependenceinversion;

public class StudyGoCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习 Go");
    }
}
