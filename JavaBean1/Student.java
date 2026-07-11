package JavaBean1;

public class Student {
    private String name;
    private int age;
    private String sex;
    private double chinese;
    private double math;

    //提供一个有参构造器
    //鼠标右键，generate constructor ，全选
    public Student(String name, int age, String sex, double chinese, double math) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.chinese = chinese;
        this.math = math;
    }
    //提供无参构造器
    //右键鼠标，generate constructor ，选择Select None
    public Student() {
    }

    //提供公开的getter和setter方法
    //右键鼠标，generate getter and setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }




}
