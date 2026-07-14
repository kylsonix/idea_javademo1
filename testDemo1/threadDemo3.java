package testDemo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class threadDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：多线程的创建方式三：实现Callable接口，FutureTask类
        //创建Callable接口的实现类，并创建FutureTask对象
        Callable r = new MyCallable(100);
        //创建Thread对象，构造方法中传递FutureTask对象
        FutureTask<Object> ft = new FutureTask<Object>(r);
        //创建Thread对象，构造方法中传递FutureTask对象
        Thread t = new Thread(ft);
        //启动线程
        t.start();
        //获取call()方法返回的结果
        System.out.println(ft.get());
    }
}

class MyCallable implements Callable<Object> {
    //返回1到100的偶数和
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return "子程序运行结束，结果是：" +sum;
    }
}
