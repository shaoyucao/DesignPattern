package com.syc.study.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        //使用继承关系获取数据库连接
        ProductDaoUseExtends productDaoUseExtends = new ProductDaoUseExtends();
        productDaoUseExtends.addProducts();

        //使用组合/聚合复用原则
        System.out.println("=========");
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PgsqlConnection());
        productDao.addProduct();

    }
}
