package com.syc.study.principle.interfacesegregation;

/**
 * 狗，只会吃和游泳，但不会飞
 */
public class Dog implements IEatAnimalAction, ISwimAnimalAction{
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
