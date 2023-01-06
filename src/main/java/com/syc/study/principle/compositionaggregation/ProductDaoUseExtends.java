package com.syc.study.principle.compositionaggregation;

public class ProductDaoUseExtends extends FatherDBConnection{
    public void addProducts(){
        String connection = super.getConnection();
        System.out.println("使用"+connection+"增加产品");
    }
    //如果使用pgsql数据库，则需要在DBConnection中添加其他方法
    //破坏了开闭原则

}
