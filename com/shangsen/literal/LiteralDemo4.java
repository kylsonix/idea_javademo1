package com.shangsen.literal;


import java.util.Scanner;

public class LiteralDemo4 {
    public static void main(String[] args) {
        //输入一个整数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        //拆分这个整数
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100%10;
        //alt+p,强制生成代码
        System.out.println("百位："+bai);
        System.out.println("十位："+shi);
        System.out.println("个位："+ge);

    }
}
