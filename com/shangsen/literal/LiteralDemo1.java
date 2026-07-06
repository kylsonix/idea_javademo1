package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int num1=sc.nextInt();
        System.out.println(num1);
        System.out.println(num+num1);
        double num2=sc.nextDouble();
        System.out.println(num2);
        String str = sc.next();
        System.out.println(str);
        char ch = sc.next().charAt(0);
    }
}
