package com.syc.study.principle.dependenceinversion;

public class Tom {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyJava() {
        System.out.println("学习 Java");
    }

    public void studyPython() {
        System.out.println("学习 Python");
    }

    public void studyGo() {
        System.out.println("学习 Go");
    }

    public void study(ICourse iCourse) {
        iCourse.study();
    }

    public void studyV2() {
        this.iCourse.study();
    }
}
