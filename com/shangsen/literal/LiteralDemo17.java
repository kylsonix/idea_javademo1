package com.shangsen.literal;

public class LiteralDemo17 {
    public static void main(String[] args) {
        //定义一个数组的三种方法
        String[] arr = {"hello","world","java"};
        String[] arr1 = new String[]{"hello","world","java"};
        //获取数组的长度
        int length =arr1.length ;
        //数据类型[] 数组名 = new 数据类型[数组的长度];
        //动态初始化数组，只确定数组的类型和数组的长度，不事先录入数组元素
        String[] arr2 = new String[3];
        //不推荐这样书写
        //String arr2[] = new String[]{"hello","world","java"};

    }
}
