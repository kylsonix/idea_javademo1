package singleinstance1;
//懒汉式单例
public class B {
    private B() {

    }

    //定义一个类变量记住类的唯一一个对象，静态变量
    private static  B b;
    //定义一个静态方法，返回对象
    //在需要对象的时候，调用这个方法，方法内部会判断对象是否为空，为空则创建对象，不为空则直接返回对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }


}
