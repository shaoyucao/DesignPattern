package com.syc.study.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.produce();
        // 需求一：使用简单工厂 创建Video课程
        VideoFactory videoFactory = new VideoFactory();
        Video pythonVideo = videoFactory.getVideo("Python");
        if(pythonVideo == null) {
            return;
        }
        pythonVideo.produce();

        //需求二：扩展简单工厂，使其符合开闭原则
        Video javaVideo = videoFactory.getVideo2(JavaVideo.class);
        javaVideo.produce();
    }
}
