package abstractdemo1;
//一个类继承抽象类，必须重写完抽象类中的全部抽象方法，否则这个类也必须定义为抽象类

public class B extends  A{
    public B(String name, int age) {
        super(name, age);
    }

    public B() {
    }



    @Override
    public void show() {
        System.out.println("B show");
    }
}
