package com.syc.study.principle.interfacesegregation;

/**
 * 鸟，只会吃和飞翔，但不会游泳
 */
public class Bird implements IEatAnimalAction, IFlyAnimalAction{
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
