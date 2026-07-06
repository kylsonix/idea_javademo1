package com.shangsen.literal;

public class LiteralDemo12 {
    public static void main(String[] args) {
        //switch可以有操作结果，yield关键词
        int number = 1;
        String result = switch (number) {
            case 1, 2, 3 -> {
                yield "1,2,3";
            }
            case 4, 5, 6 -> {
                yield "4,5,6";
            }
            default -> {
                yield "other";
            }
            //如果只有一个结果，可以省略{}，和yield
//            case 1,2,3 -> "1,2,3";
//            case 4,5,6 -> yield "4,5,6";
//            default -> "other";
        };
        System.out.println(result);
    }
}
