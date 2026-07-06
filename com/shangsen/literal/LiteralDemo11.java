package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo11 {
    public static void main(String[] args) {
        //switch箭头标签，箭头标签后可以接大括号且没有case穿透
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int a = sc.nextInt();
        switch (a) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            //case后可以接多个值
            case 8,9,10-> System.out.println("输入的数字有误");
            default -> {
                System.out.println("没有这个星期");
                System.out.println("请输入1-7的数字");
            }
        }


    }
}
