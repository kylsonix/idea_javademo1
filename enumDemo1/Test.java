package enumDemo1;

public class Test {
    public static void main(String[] args) {
        //认识枚举类
        A a1 = A.A1;
        System.out.println(a1);

        A a2 = A.A2;
        System.out.println(a2);

        System.out.println(a1.name());//A1
        System.out.println(a1.ordinal());//索引0
        System.out.println(A.valueOf("A1"));//A1
        System.out.println(A.values());//[A1, A2]

    }
}
