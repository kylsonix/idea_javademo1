package capsulation1;

public class Student {
    String name;
    //如何隐藏数据成员变量，private，修饰成员变量，就只能在本类中访问
    private int age;
    private double chinese;
    private double math;
    //如何暴露成员变量，public，修饰成员变量，就可以在任意类中访问
    public void setAge(int age){
        if (age >= 0 && age <= 120) {
            this.age = age;
            System.out.println("年龄设置成功");
        }
        else{
            System.out.println("请输入正确的年龄");
        }
    }
    //获取年龄
    public int getAge(){
        return age;
    }


    public void print(){
        System.out.println(name+"的语文成绩是"+chinese+"，数学成绩是"+math);
    }
    //总成绩
    public void sum(){
        System.out.println(name+"的总成绩是"+(chinese+math));
    }
    public void avg(){
        System.out.println(name+"的平均成绩是"+(chinese+math)/2);
    }
}
