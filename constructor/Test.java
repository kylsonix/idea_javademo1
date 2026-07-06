package constructor;

public class Test {
    public static void main(String[] args) {
        //认识构造器
        //构造器可以在创建对象时，同时完成对对象的初始化赋值
        Student s1 = new Student();
        //创建对象时可以立即给对象赋值
        Student s2 = new Student("张三", 18);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
