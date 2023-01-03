package com.syc.study.principle.openclose;

public class DiscountCourse extends JavaCourse {

    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
