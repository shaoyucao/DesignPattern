package com.syc.study.principle.singleresponsibility;

public interface ICourse {
    //属于获取可能内容的接口方法
    String getCourseName();
    Byte[] getCourseVideo();

    //属于课程管理的接口方法
    void studyCourse();
    void refundCourse();
}
