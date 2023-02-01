package com.syc.study.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式精讲")
                .builderCoursePPT("Java设计模式PPT").makeCourse();
        System.out.println(course);
    }
}
