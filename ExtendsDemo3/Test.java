package ExtendsDemo3;
//只能有一个类用public 修饰符，不能添加多个
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    String name = "fu的name";
    public void run() {
        System.out.println("fu的run");
    }
}
class Zi extends Fu {
    String name = "zi的name";
    public void show() {
        String name = "show的name";

        //访问呈就近的原则
        System.out.println(name);//show的name
        //this 表示本类
        System.out.println(this.name);//zi的name
        //super 表示父类
        System.out.println(super.name);//fu的name
        run(); //zi的run
        super.run();//fu的run
    }
    public void run() {
        System.out.println("zi的run");
    }
}
