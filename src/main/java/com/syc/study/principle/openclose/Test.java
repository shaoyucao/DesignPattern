package com.syc.study.principle.openclose;

public class Test {
    public static void main(String[] args) {
        //需求一：输出课程的基本信息
        Icourse javaCourse = new JavaCourse(1, "《Java从0到精通》", 366d);
        System.out.println("课程id: " + javaCourse.getId() + ", 课程名称: " + javaCourse.getName() + ", 课程价格: " + javaCourse.getPrice());
        //需求二：Icourse对所有课程打八折，请输出课程的基本信息和折后价格
        Icourse icourse = new DiscountCourse(1, "《Java从0到精通》", 366d);
        DiscountCourse discountCourse = (DiscountCourse) icourse;
        System.out.println("课程id: " + javaCourse.getId() + ", 课程名称: "
                + discountCourse.getName() + ", 课程原价: " + discountCourse.getOriginalPrice() + ", 课程折后价格: " + discountCourse.getPrice());
    }
}
