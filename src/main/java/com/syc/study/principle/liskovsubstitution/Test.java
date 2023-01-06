package com.syc.study.principle.liskovsubstitution;

public class Test {
    private static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("宽:"+rectangle.getWidth()+" 长:" + rectangle.getLength());
        }
        System.out.println("宽:"+rectangle.getWidth()+" 长:" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);

    }
}
