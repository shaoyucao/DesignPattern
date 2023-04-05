package power;

public class PowerAdapter implements TargetPower{

    HousePower housePower = new HousePower();

    @Override
    public int output() {
        int output = housePower.output();
        output /= 44;
        System.out.println("转换后输出：" + output + "V");
        return output;
    }
}
