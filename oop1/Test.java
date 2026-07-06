package oop1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //创建对象的格式：类名 对象名 = new 类名();
        Star star1 = new Star();
        star1.name = "王宝强";
        star1.age = 40;
        star1.sex = "男";
        star1.height = 1.7;
        star1.weight = 80.5;
        System.out.println(star1.name);
        System.out.println(star1.age);
        System.out.println(star1.sex);
        System.out.println(star1.height);
        System.out.println(star1.weight);


        Star star2 = new Star();
        star2.name = "杨幂";
        star2.age = 30;
        star2.sex = "女";
        star2.height = 1.6;
        star2.weight = 50.5;
        System.out.println(star2.name);
        System.out.println(star2.age);
        System.out.println(star2.sex);
        System.out.println(star2.height);
        System.out.println(star2.weight);

    }
}
