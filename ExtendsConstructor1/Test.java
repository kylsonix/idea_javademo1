package ExtendsConstructor1;
//子类构造器必须先调用父类的构造器，再执行自己的构造器
//如果不调用父类的无参构造器，则必须要调用父类的有参构造器
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();

    }
}

class Zi extends Fu {
    public Zi()
    {
        super();//默认存在，写不写都有
        System.out.println("子类无参构造方法");
    }

}

class Fu {
    public Fu()
    {
        System.out.println("父类无参构造方法");
    }
    public Fu(int a)
    {
        System.out.println("父类有参构造方法");
    }
}
