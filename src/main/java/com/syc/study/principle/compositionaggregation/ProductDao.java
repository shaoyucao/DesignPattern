package com.syc.study.principle.compositionaggregation;

public class ProductDao {
    private DBConnection dbConnection;

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        System.out.println("使用"+dbConnection.getConnection()+"增加产品");
    }
}
