package ExtendsDemo22;

import ExtendsDemo2.Fu;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        //在其他包的普通类中，不能访问private，protected，default默认方法
        //f.privateMethod();
        //f.method();
        //f.protectedMethod();
        f.publicMethod();
    }
}
