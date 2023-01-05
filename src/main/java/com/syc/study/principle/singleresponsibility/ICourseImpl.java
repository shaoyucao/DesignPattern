package com.syc.study.principle.singleresponsibility;

public class ICourseImpl implements ICourseManager, ICourseContent{

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public Byte[] getCourseVideo() {
        return new Byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
