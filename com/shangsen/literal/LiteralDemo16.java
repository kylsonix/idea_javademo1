package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo16 {
    public static void main(String[] args) {
        //判断n到m的数那些是素数
        System.out.println("判断n到m的数那些是素数");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        System.out.println("请输入m：");
        int m = sc.nextInt();
        
        System.out.println(n +"到" + m + "之间的素数有：");
        for (int i = n; i <= m; i++) {
            //如果判断为ture，则输出
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        // 只需要检查到√num即可
        //Math.sqrt();  是计算平方根
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
