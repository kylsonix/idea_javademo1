package com.shangsen.literal;

public class LiteralDemo18 {
    public static void main(String[] args) {
        //开发一个简易版的斗地主游戏，要求只完成做牌（存储54张牌）和洗牌
        //创建动态初始化数组，再存储54张牌
        start();
    }

    //创建一个函数开始
    public static void start(){
        //创建动态初始化数组，再存储54张牌
        String[] poker = new String[54];
        //创建索引
        int index = 0;
        //准备四种花色
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //先遍历花色，再遍历点数
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                //将牌存入到数组中
                poker[index] = colors[i]+numbers[j];
                index++;
            }
        }

        //存入大小王
        poker[index] = "小王";
        poker[index+1] = "大王";
        //打印所有牌
        for (int i = 0; i < poker.length; i++) {
            //每13张牌换行
            if (i % 13 == 0) {
                System.out.println();
            }
            System.out.print(poker[i]+" ");
        }

        //洗牌，随机生成一个索引，和当前索引交换
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int)(Math.random()*poker.length);
            String temp = poker[i];
            poker[i] = poker[index1];
            poker[index1] = temp;
//            System.out.print(poker[i]+" ");
//            System.out.print(poker[index1]+" ");
//            System.out.println();
        }
        //洗完牌后，牌顺序打印
        for (int i = 0; i < poker.length; i++) {
            if (i % 13 == 0) {
                System.out.println();
            }
            System.out.print(poker[i]+" ");

        }

    }
}
