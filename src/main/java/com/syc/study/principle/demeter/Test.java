package com.syc.study.principle.demeter;

public class Test {
    public static void main(String[] args) {
        //需求：Boss向Leader询问目前有多少在线课程
        /**
         * 因为Boss不用关心课程，他之和leader打交道，因此需要将和Course相关的业务逻辑放到Leader类里面
         */
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.commandCheckNumber(leader);

    }
}
