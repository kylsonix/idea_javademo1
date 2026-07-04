package Demo1;

//自定义异常类
//继承 Exception
//重写 Exception 构造器
//哪里需要异常返回，哪里就throw new 自定义异常类
public class AgeIllegalException extends Exception {
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
