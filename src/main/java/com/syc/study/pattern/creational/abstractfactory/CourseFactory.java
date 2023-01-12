package com.syc.study.pattern.creational.abstractfactory;

/**
 * 抽象工厂解决同一产品族的问题
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
