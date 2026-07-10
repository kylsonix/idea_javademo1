package Polymorphism1;

public class Animal {

    String name = "动物";

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void run() {
        System.out.println("动物会跑");
    }

}
