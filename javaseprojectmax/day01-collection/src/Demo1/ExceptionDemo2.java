package Demo1;

public class ExceptionDemo2 {
    public static void main(String[] args) {

    }

    public static void saveAge(int age) throws AgeIllegalException {
        if(age < 0 || age > 150){
            throw new AgeIllegalException();
        }
        else {
            System.out.println("保存年龄成功");
        }
    }
}
