package testDemo1;

public class threadDemo2 {
    public static void main(String[] args) {
    //目标：多线程的创建方式二：实现Runnable接口
    Runnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();

    for (int i = 0; i < 100; i++) {
        System.out.println("线程0："+i);
    }

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1："+i);
        }
    }
}
