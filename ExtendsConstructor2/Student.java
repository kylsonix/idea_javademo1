package ExtendsConstructor2;

public class Student {
    private String name;
    private String sex;
    private int age;
    private String school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }

    public Student() {
    }

    //this调用兄弟构造器
    //注意事项：super(...)和this(...)必须写在构造器的第一行，而且二者不能同时出现
    public Student(String name, String sex, int age) {
        // this.name = name;
        // this.sex = sex;
        // this.age = age;
        // this.school = "上海大学";
        this(name, sex, age, "上海大学");
    }

    public Student(String name, String sex, int age, String school) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
