package ExtendsDemo22;

import ExtendsDemo2.Fu;

public class Zi extends Fu {
    public void show() {
        //其他包的子类中，不能调用private和default默认方法
        //privateMethod();
        //method();
        protectedMethod();
        publicMethod();
    }
}
