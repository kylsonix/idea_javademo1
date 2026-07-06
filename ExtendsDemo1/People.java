package ExtendsDemo1;
//父类
//继承的好处：代码复用，减少重复代码的编写
//继承的格式：class 子类 extends 父类
public class People {
    private String name;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
