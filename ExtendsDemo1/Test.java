package ExtendsDemo1;

public class Test {
    public static void main(String[] args) {
        //认识继承
        //1、创建对象，封装老师数据
        //子类可以继承父类的非私有成员变量
        //子类对象其实是有由子类和父类多张设计图共同创建出来的对象，所有子类对象是完整的
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setSex('男');
        t1.setSkill("Java");
        System.out.println(t1.getName() + " " + t1.getSex() + " " + t1.getSkill());
    }
}
