package oop1;
//封装思想：把数据和对数据的处理放到同一个类中
public class Student {
    String name;
    double chinese;
    double math;
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
