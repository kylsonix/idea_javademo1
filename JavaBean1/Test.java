package JavaBean1;



public class Test {
    public static void main(String[] args) {
        //啥是实体类，其基本作用和应用场景
        //实体类的基本作用：创建它的对象，封装数据
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setSex("男");
        s1.setChinese(90);
        s1.setMath(80);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());
        //有参构造器，创建对象
        Student s2 = new Student("李四",19,"男",60,50);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        //实体类在开发中的利用场景
        //实体类的对象只负责封装数据，而对数据进行操作的，应该使用其他类，以实现数据和数据业务处理的分离。
        StudentOperator so = new StudentOperator(s1);
        so.printScore();
        so.printAvg();

        StudentOperator so2 = new StudentOperator();
        so2.printScore(s2);
        so2.printAvg(s2);
    }
}
