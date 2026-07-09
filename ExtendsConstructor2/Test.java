package ExtendsConstructor2;

public class Test {
    public static void main(String[] args) {
        //理解this(...)调用兄弟构造器
        //创建对象，存储一个学生对象
        Student s1 = new Student("张三", "男", 18);
        Student s2 = new Student("李四", "女", 19, "上海交通大学");

        System.out.println(s1);
        System.out.println(s2);
    }
}
