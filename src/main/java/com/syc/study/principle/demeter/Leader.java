package com.syc.study.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public void checkNumber() {
        List<Course> list = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("在线课程的数量是：" + list.size());
    }
}
