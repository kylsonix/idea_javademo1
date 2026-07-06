package oop1;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 90;
        s1.math = 80;
        s1.print();
        s1.sum();
        s1.avg();


        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 80;
        s2.math = 60;
        s2.print();
        s2.sum();
        s2.avg();

    }
}
