package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo3 {
    public static void main(String[] args) {
        //BMI=体重/身高^2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        //计算BMI
        double bmi = weight/(height*height);
        System.out.println("BMI="+bmi);
    }
}
