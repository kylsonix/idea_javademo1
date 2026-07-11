package JavaBean1;

public class StudentOperator {
    //必须拿到学生的信息
    private Student student;
    //无参构造器
    public StudentOperator(){
        student = new Student();
    }
    //定义一个有参构造器·
    public StudentOperator(Student student){
        this.student = student;
    }

    //打印学生总成绩
    public void printScore(){
        System.out.println(student.getName() + "的总成绩是：" + (student.getChinese()+ student.getMath()));
    }
    //打印学生平均成绩
    public void printAvg(){
        System.out.println(student.getName() + "的平均成绩是：" + (student.getChinese()+ student.getMath())/2);
    }



    //提供方法：打印学生的总成绩
    public void printScore(Student s){
        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese()+ s.getMath()));
    }
    //打印学生的平均成绩
    public void printAvg(Student s){
        System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese()+ s.getMath())/2);
    }
}
