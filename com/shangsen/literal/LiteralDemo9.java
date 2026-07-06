package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo9 {
    public static void main(String[] args) {
        //录入一个四位整数，判断是否为回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数:");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        if(ge == qian && shi == bai){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
