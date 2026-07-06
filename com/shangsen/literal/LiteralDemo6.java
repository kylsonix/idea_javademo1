package com.shangsen.literal;

public class LiteralDemo6 {
    public static void main(String[] args) {
        //数字运算：类型不一样的不能进行运算，需要转成同类型的才能进行运算
        //取值范围：byte < short < int < long < float < double
        //隐式转换，从小的到大的进行转换
        //1.如有byte，short类型，会提升为int类型
        //2.把取值范围小的数据类型提升为取值范围大的数据类型，再进行运算
        byte b = 10;
        byte c = 20;
        //b+c为int类型
        //byte sum = b+c;报错,运算结果为int类型
        int sum1 = b+c;

        //强制转换，从大的到小的进行转换
        //强制转换不会自动触发，需要手动书写代码
        //弊端：会导致数据精度丢失
        //目标数据类型 变量名 = （目标数据类型）被强制转换的数据；
        byte d = (byte)(b+c);

    }
}
