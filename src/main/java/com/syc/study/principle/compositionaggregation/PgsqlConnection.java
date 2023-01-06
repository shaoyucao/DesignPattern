package com.syc.study.principle.compositionaggregation;

public class PgsqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "pgsql数据库连接";
    }
}
