package com.syc.study.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        //需求一：Tom除了要学习Java，Python，还要学习Go
        Tom tom = new Tom();
        tom.studyJava();
        tom.studyPython();
        tom.studyGo();
        //需求二：要进一步扩展Tom学习的课程，不能在底层做改动
        System.out.println("===========");
        Tom tom1 = new Tom();
        tom1.study(new StudyJavaCourse());
        tom1.study(new StudyPythonCourse());
        tom1.study(new StudyGoCourse());
        tom1.study(new StudyPHPCourse());
        //需求三：不使用传参方式，不对study方法传课程
        System.out.println("===========");
        Tom tom2 = new Tom();
        tom2.setiCourse(new StudyJavaCourse());
        tom2.studyV2();
        tom2.setiCourse(new StudyPythonCourse());
        tom2.studyV2();

    }
}
