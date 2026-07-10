package Polymorphism1;

//多态的前提
//有继承/实现关系，存在父类引用指向子类对象，存在方法重写

public class Test {
    public static void main(String[] args) {
        //多态的好处
        //1、对象多态
        //右边对象是解耦合的，便于后期的扩展和维护
        Animal a1 = new Wolf();
        Animal a2 = new Tortoise();


        a1.run();//狼跑得快
        a2.run();//乌龟跑得慢

        //2、父类可以接受一切子类对象
        go(a1);
        go(a2);

        //多态的弊端
        //多态下不能调用子类的独有功能
        //a1.eat();
        //编译看左边，父类没有子类的独有功能，所以编译失败

        //对于成员变量，编译时看左边，运行时也看左边
        //多态只强调对象多态和行为多态，不强调成员变量多态
        System.out.println(a1);//Animal{name='动物'}
        System.out.println(a2);//Animal{name='动物'}

    }
    //定义方法时，使用父类类型形参，可以接受一切子类对象，扩展性更强，更便利
    public static void go(Animal a) {
        System.out.println("开始");
        a.run();
    }
}
