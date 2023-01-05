package com.syc.study.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber(Leader leader) {
//        List<Course> list = new ArrayList<>();
//        for(int i = 0; i < 20; i++) {
//            list.add(new Course());
//        }
//        leader.checkNumber(list);
        leader.checkNumber();
    }
}
