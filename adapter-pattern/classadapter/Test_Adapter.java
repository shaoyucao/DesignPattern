package classadapter;

public class Test_Adapter {
    public static void main(String[] args) {
        Target concrete = new ConcreteTarget();
        concrete.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
