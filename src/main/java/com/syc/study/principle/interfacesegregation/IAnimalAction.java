package com.syc.study.principle.interfacesegregation;

/**
 * 动物这个接口有一些行为，如吃、游泳、飞翔；但针对陆地动物和鸟类，有些行为并不适配，所以需要把这个粗力度的接口拆分成更细粒度的接口
 */
public interface IAnimalAction {
    void eat();
    void swim();
    void fly();
}
