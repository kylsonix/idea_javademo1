package com.shangsen.literal;

import java.util.Scanner;

public class LiteralDemo15 {
    public static void main(String[] args) {
        //开发一个程序，可以生成指定位数的验证码返回，每位只能是由数字或者是字母的大小写组成
        //输入的验证码位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码位数：");
        int number = sc.nextInt();
        String code = getRandomChar(number);

        //打印出验证码
        System.out.println(code);
    }

    //从验证码中随机获取一个字符
    public static String getRandomChar(int number) {
        //验证码初始为空，通过循环，每次生成一个随机字符，并拼接在验证码中
        String code = "";
        for (int i = 0; i < number; i++) {
            //生成1到3的随机数，1代表数字，2代表大写字母，3代表小写字母
            int num = (int) (Math.random() * 3 + 1);
            switch (num) {
                case 1:
                    //生成0到9的随机数
                    //数字0的ASCII码是48，而非正常的数字0，所以要加上48
                    code += (char) (Math.random() * 10 + 48);
                    break;
                case 2:
                    //生成65到90的随机数
                    //大写字母的ASCII码是65，而非正常的大写字母A，所以要加上65
                    code += (char) (Math.random() * 26 + 65);
                    break;
                case 3:
                    //生成97到122的随机数
                    //小写字母的ASCII码是97，而非正常小写字母a，所以要加上97
                    code += (char) (Math.random() * 26 + 97);
                    break;
            }
        }
        return code;
    }

}
