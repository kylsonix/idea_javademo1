package ExtendsOverride1;
//重写的规范：声明不变，重新实现
public class Test {
    public static void main(String[] args) {
        cat c = new cat();
        c.cry();
    }
}
//子类重写父类的方法时，访问权限修饰符必须一致，或者子类权限修饰符必须大于父类权限修饰符
// （public>protected>default>private）
//重写方法的返回类型必须与被重写方法一致，或者范围更小
//（object>integer）
//私有方法，静态方法不能被重写
//静态方法static，属于类，不能被重写
class Animal {
    public void cry() {
        System.out.println("动物的叫声~~~~");
    }
}
class cat extends Animal {
    //方法重写的校验注解（标志），要求方法名和参数列表必须与被重写方法一致
    //@Override 会让编译器检查你是否正确地重写了父类的方法。如果：
    //方法名写错了
    //参数列表不匹配
    //父类中根本没有这个方法
    //编译器会立即报错，帮助你发现错误。
    //@Override 注解，这是一种防御性编程的好习惯，能帮你避免很多难以发现的 bug。
    @Override
    public void cry() {
        System.out.println("喵喵喵~~~");
    }
}