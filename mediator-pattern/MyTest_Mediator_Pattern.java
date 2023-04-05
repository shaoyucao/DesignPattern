public class MyTest_Mediator_Pattern {
    public static void main(String[] args) {
        User tom = new User("Tom");
        User jack = new User("Jack");
        tom.sendMessage("我是tom, 大家好");
        jack.sendMessage("你好啊！ 欢迎来到学习小组");
    }
}
