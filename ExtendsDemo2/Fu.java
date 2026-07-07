package ExtendsDemo2;

public class Fu {
    //只能在本类
    private void privateMethod() {
        System.out.println("privateMethod");
    }
    //本类，同一个包中的类中
    void method() {
        System.out.println("method");
    }
    //本类，同一个包中的类中，子孙类中
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    //任意位置
    public void publicMethod() {
        System.out.println("publicMethod");
    }



    //本类中访问
    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }

}
