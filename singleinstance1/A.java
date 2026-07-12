package singleinstance1;
//饿汉式单例
public class A {
    //1、私有化构造器
    private A() {

    }

    //2、定义一个类变量记住类的唯一一个对象，静态变量
    private static  A a = new A();
    //方法二：public static final A a = new A();


    //3、定义一个静态方法，返回对象
    public static A getInstance() {
        return a;
    }

}
