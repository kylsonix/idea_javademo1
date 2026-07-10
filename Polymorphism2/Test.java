package Polymorphism2;

//多态的前提
//有继承/实现关系，存在父类引用指向子类对象，存在方法重写

public class Test {
    public static void main(String[] args) {
        //认识多态
        //1、对象多态
        Animal a1 = new Wolf();
        Animal a2 = new Tortoise();

        //行为多态
        //编译看的是左边，运行看右边
        //编译时看的Animal类里有没有run()，运行时看Wolf类里有没有run()
        a1.run();//狼跑得快
        a2.run();//乌龟跑得慢


        //对于成员变量，编译时看左边，运行时也看左边
        //多态只强调对象多态和行为多态，不强调成员变量多态
        System.out.println(a1);//Animal{name='动物'}
        System.out.println(a2);//Animal{name='动物'}

    }
}
