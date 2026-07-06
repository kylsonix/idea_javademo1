package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo5 {
    public static void main(String[] args) {
        //时间的转化，给定秒数时间，将秒数转化为时分秒
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();
        System.out.println("给定的秒数为：" + seconds);
        //获取小时数
        int hours = seconds / 3600;
        System.out.println("小时数：" + hours);
        //获取分钟数
        int minutes = (seconds - hours * 3600) / 60;
        System.out.println("分钟数：" + minutes);
        //获取秒数
        int second = seconds - hours * 3600 - minutes * 60;
        System.out.println("秒数：" + second);
        System.out.println("转换后的时间：" + hours + "时" + minutes + "分" + second + "秒");

    }
}
