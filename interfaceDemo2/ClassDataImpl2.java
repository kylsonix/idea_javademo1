package interfaceDemo2;

public class ClassDataImpl2 implements ClassData1{
    private Student[] students;//存储接受的所有学生信息
    public ClassDataImpl2(Student[] students)
    {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos()
    {
        int manCount = 0;
        System.out.println("全体学生的信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student a = students[i];
            System.out.println(a.getName() + " " + a.getSex() + " " + a.getScore());
            //统计男生的人数
            if (a.getSex() == '男')
            {
                manCount++;
            }
        }
        System.out.println("全体学生的人数：" + students.length);
        System.out.println("男生的人数：" + manCount);
        System.out.println("女生的人数："+ (students.length - manCount));
    }
    @Override
    public void printAverageScore()
    {
        Student s1 = students[0];
        double sum = 0;
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 0; i < students.length; i++) {
            Student a = students[i];
            if (a.getScore() > max)
            {
                max = a.getScore();
            }
            if (a.getScore() < min)
            {
                min = a.getScore();
            }
            sum += a.getScore();
        }
        System.out.println("全体学生的平均分(减去最高分，最低分）是：" + (sum - max - min) / (students.length - 2));
        System.out.println("全体学生的最高分是：" + max);
        System.out.println("全体学生的最低分是：" + min);
        System.out.println("全体学生的平均分是：" + sum / students.length);
    }
}