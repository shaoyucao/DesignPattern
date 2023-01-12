package com.syc.study.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        //需求一：使用抽象工厂模式生产不同语言的课程
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        article.produce();
        Video video = courseFactory.getVideo();
        video.produce();

        CourseFactory courseFactory2 = new PythonCourseFactory();
        Article article2 = courseFactory2.getArticle();
        article2.produce();
        Video video2 = courseFactory2.getVideo();
        video2.produce();

    }
}
