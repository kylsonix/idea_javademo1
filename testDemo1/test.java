package testDemo1;

public class test {
    //main方法本身是由一条主线程负责推进执行的
    public static void main(String[] args) {
        //目标：认识多线程
        //1、定义一个子类继承Thread，成为线程类
        Thread myThread = new MyThread();
        //3、创建一个线程对象，启动线程
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("线程0："+i);
        }
    }
}

class MyThread extends Thread{
//2、重写run方法，将线程要执行的任务声明在此方法中
    @Override
    public void run() {
        //线程要执行的任务
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1："+i);
        }
    }
}