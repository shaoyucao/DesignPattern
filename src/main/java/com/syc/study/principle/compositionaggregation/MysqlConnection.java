package com.syc.study.principle.compositionaggregation;

public class MysqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "mysql数据库连接";
    }
}
