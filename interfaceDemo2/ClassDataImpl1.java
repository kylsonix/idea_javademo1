package interfaceDemo2;

public class ClassDataImpl1 implements ClassData1 {
    private Student[] students;//存储接受的所有学生信息

    public ClassDataImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全体学生的信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student a = students[i];
            System.out.println(a.getName() + " " + a.getSex() + " " + a.getScore());

        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student a = students[i];
            sum += a.getScore();
        }
        System.out.println("全体学生的平均分是：" + sum / students.length);
    }
}
