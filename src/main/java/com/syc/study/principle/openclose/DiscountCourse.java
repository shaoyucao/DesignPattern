package com.syc.study.principle.openclose;

public class DiscountCourse extends JavaCourse {

    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

    /**
     * 不能直接在getPrice()方法内进行打折，这样就覆盖了父类的getPrice方法，违背了里氏替换原则的引申含义
     * @return
     */
    public Double getPrice() {
        return super.getPrice();
    }
}
