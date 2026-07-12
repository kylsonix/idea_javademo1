package singleinstance1;

public class Test {
    public static void main(String[] args) {
        //设计单例类
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1 == a2);
    }
}
