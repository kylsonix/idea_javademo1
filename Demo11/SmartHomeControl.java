package Demo11;
//智能家居控制系统
public class SmartHomeControl {
    //单例类
    private SmartHomeControl() {
    }
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }
    public void control(Jd jd) {
        System.out.println("京东智能控制");
        System.out.println("开始操作");
        //设备当前状态
        System.out.println("当前状态：" + (jd.isOn()?"开启":"关闭"));
        jd.press();//按下开关
        System.out.println("当前状态：" + (jd.isOn()?"开启":"关闭"));

    }
    //打印所有京东设备信息
    public void printAllJdInfo(Jd[] jds) {
        for (int i = 0; i < jds.length; i++) {
            System.out.println(jds[i].getName() + " 当前状态是：" + jds[i].isOn());
        }
    }
}
