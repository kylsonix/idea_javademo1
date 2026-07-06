package com.shangsen.literal;

import java.util.Random;
import java.util.Scanner;

public class LiteralDemo14 {
    public static void main(String[] args) {
        //随机生成一个1-100的随机数，提示用户输入，判断输入的数字大小，如果输入的数字比随机数小，则提示输入的数字小，如果输入的数字比随机数大，则提示输入的数字大，如果输入的数字等于随机数，则提示输入的数字正确，并结束程序
        int number = (int)(Math.random()*100+1);
        //Math.random()生成0-1的随机小数,强转成 int，生成0到99的随机数，再加1，生成1到100的随机数
        Scanner sc = new Scanner(System.in);
        //需要导入java.util.Random才能使用的随机数生成
        Random random = new Random();
        random.nextInt(100);
        /*生成一个 0 到 99 的随机整数（包含0，不包含100）
        范围是：[0, 100)
        + 1
        在上面的结果上加 1
        把范围从 0-99 变成 1-100*/
        int number1 = random.nextInt(100)+1;
        while(true){
            System.out.println("请输入数字：");
            int input = sc.nextInt();
            if(input > number){
                System.out.println("输入的数字太大了");
            }else if(input < number){
                System.out.println("输入的数字太小了");
            }else{
                System.out.println("输入的数字正确");
                break;
            }
        }

    }
}
