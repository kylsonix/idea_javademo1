package interfaceDemo2;

public class Test {
    public static void main(String[] args) {
        //完成接口的小案例
        //1、定义学生类，建立学生对象，封装学生数据，交给别人处理学生数据
        //2、准备学生数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男',90);
        allStudents[1] = new Student("李四", '女',85);
        allStudents[2] = new Student("王五", '男',78);
        allStudents[3] = new Student("赵六", '女',74);
        allStudents[4] = new Student("孙七", '男',56);
        allStudents[5] = new Student("周八", '女',97);
        allStudents[6] = new Student("吴九", '男',67);
        allStudents[7] = new Student("郑十", '女',70);
        allStudents[8] = new Student("赵敏", '男',100);
        allStudents[9] = new Student("张斯", '女',73);

        //3、提供两套业务实现方案，支持灵活切换（解耦合），面向接口编程
        //定义接口，打印全班学生信息，打印平均分
        //第一套方案：打印全班学生信息，打印平均分
        //第二套方案：打印全班学生信息，包含男女生人数，打印平均分（去掉最高分和最低分）


        ClassData1 s1 = new ClassDataImpl2(allStudents);
        s1.printAllStudentInfos();
        s1.printAverageScore();

    }
}
