package abstractdemo1;

public abstract  class A {

    //抽象方法：必须用abstract修饰，抽象方法不能有方法体，只有方法声明
    public abstract void show();

    //抽象类最核心的特点是：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现

    //抽象类中不一定有抽象方法，但是有抽象方法的类必须是抽象类
    //类有的成员：成员变量，方法，构造器，抽象类都可以有
    private String name;
    public int age;

    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showName(){
        System.out.println(name);
    }



}
