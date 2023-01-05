package com.syc.study.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        //需求一：实现不同的人说不同的语言
        Person person = new Person();
        person.speak("中国人");
        person.speak("英国人");
        //需求二：使用单一职责原则，在类的层面做功能隔离
        System.out.println("=========");
        ChinesePerson chinesePerson = new ChinesePerson();
        chinesePerson.speak("中国人");
        EnglishPerson englishPerson = new EnglishPerson();
        englishPerson.speak("英国人");
        //需求三：使用单一职责原则，在接口层面做接口隔离

    }
}
