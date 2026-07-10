package Polymorphism1;

public class Wolf extends Animal {

    String name = "狼";

    @Override
    public void run() {
        System.out.println("狼跑得快");
    }

    public void eat() {
        System.out.println("狼吃羊");
    }

}
