package Demo1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //编译式异常处理的方法二：try...catch
        try {
            //监视代码，出现异常，就会进入catch块，处理异常
            test2();
        } catch (ParseException e) {
            //直接catch Exception可以捕获所有异常
            e.printStackTrace();//打印异常信息
            throw new RuntimeException(e);//抛出运行时异常
        }
    }
        //可以直接抛Exception异常，代替所有异常格式
    public static void test2() throws ParseException {
        //编译异常:编译阶段报错，编译不通过
        String str = "2024-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //编译式异常，提醒程序员这里的程序很容易出错
        Date date = sdf.parse(str);
        //方法一，抛出异常（throws），将异常往外抛出
        //方法二，捕获异常（try...catch）
        System.out.println(date);

        //编译式异常的案例二
        //编译器担心directory下没有a.txt文件
        //InputStream is = new FileInputStream("d:/a.txt");
    }

    public static void test1() {

        //运行式异常的特点：编译时不会报错，运行时才会报错的异常，继承 RuntimeException
        int[] arr = {10, 20, 30};
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        //System.out.println(10/0);

        //空指针异常
        String str = null;
        System.out.println(str);
        System.out.println(str.length());//NullPointerException
    }
}
