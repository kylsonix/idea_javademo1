package Demo11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //面向对象编程实现智能家居控制系统
        //角色：设备（吊灯，电视机，洗衣机，落地窗，。。。）
        //具备功能：开与关
        //通过智能控制系统控制（单例对象），控制调用设备的开和关
        //1、定义设备类，创建设备对象
        //2、准备这些设备对象，放在数组中，代表整个家庭的设备
        Jd[] jds = new Jd[4];
        jds[0] = new TV("电视", false);
        jds[1] = new WashMachine("洗衣机", false);
        jds[2] = new Lamp("吊灯", false);
        jds[3] = new Air("空调", false);

        //3、为每个设备制定一个开和关的功能，接口
        //4、创建一个智能控制的对象，控制设备
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //5、控制电视机
        //smartHomeControl.control(jds[0]);
        //6、提示用户操作，展示全部的设备当前情况，让用户选择一个进行操作
        //打印全部设备信息

        while (true) {
            smartHomeControl.printAllJdInfo(jds);
            System.out.println("请选择一个设备进行操作（输入0退出）：");
            Scanner sc = new Scanner(System.in);
            
            if (!sc.hasNextInt()) {
                System.out.println("请输入有效的数字！");
                sc.next(); // 清除无效输入
                continue;
            }
            
            int index = sc.nextInt();
            
            if (index == 0) {
                System.out.println("退出控制系统");
                break;
            }
            
            if (index < 1 || index > jds.length) {
                System.out.println("无效的设备编号，请重新选择！");
                continue;
            }
            
            smartHomeControl.control(jds[index - 1]);
            System.out.println("------------------------");
        }
    }
}
