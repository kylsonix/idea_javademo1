package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //简易计算器开发
        System.out.println("请输入第一个数字：");
        double num1 = sc.nextDouble();
        System.out.println("请输入运算符：");
        char op = sc.next().charAt(0);
        System.out.println("请输入第二个数字：");
        double num2 = sc.nextDouble();
        System.out.println("结果是："+getResult(num1,op,num2));
    }
    //把数字交给一个独立的计算方法处理，并返回结果
    public static double getResult(double num1,char op,double num2){
        double result = 0;
        switch (op){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("输入的运算符有误！");
        }
        return result;
    }
}
