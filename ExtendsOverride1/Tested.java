package ExtendsOverride1;

public class Tested {
    public static void main(String[] args) {
        //方法重写的常见应用场景：子类重写Object的toString()方法，以便返回对象的内容
        Student s = new Student("张三","男",18);
        //System.out.println(s);//ExtendsOverride1.Student@23fc625e
        //默认调用Object的toString()方法，返回对象的地址信息
        //System.out.println(s.toString());//ExtendsOverride1.Student@23fc625e
        //开发中输出对象的地址是没什么意义的，更希望输出对象的内容，因此需要重写toString()方法
        System.out.println(s.toString());//姓名：张三 性别：男 年龄：18
    }
}
class Student {
    private String name;
    private String sex;
    private int age;

    //重写toString()方法
    //右键鼠标，选择Generate toString()...
    @Override
    public String toString() {
        return "姓名：" + name + " 性别：" + sex + " 年龄：" + age;
    }

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
