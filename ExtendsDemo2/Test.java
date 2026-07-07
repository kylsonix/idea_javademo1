package ExtendsDemo2;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        //当前包的其它类中，不能调用private方法
        //f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
