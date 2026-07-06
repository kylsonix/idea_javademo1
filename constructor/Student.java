package constructor;

public class Student {
    //成员变量
    String name;
    int age;
    //构造器的格式： public 类名(){}
    //创建对象时，会自动调用无参数构造器
    //1、无参数构造器
    //如果不写，类默认会生成一个无参数构造器
    public Student(){
        System.out.println("无参数构造器");
    }
    //如果定义了有参构造器，那么类默认无参数构造器将不再生成，要自己手动书写
    //所有构造器要么不写，要么全部写
    //2、有参数构造器
    //构造器可以重载
    //局部变量
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参数构造器");
    }
}
