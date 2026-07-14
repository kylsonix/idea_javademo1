package testDemo1;

public class threadDemo22 {
    public static void main(String[] args) {
        //目标：多线程的创建方式二：实现Runnable接口
        Runnable r = new MyRunnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1："+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        new Thread(new Runnable()
        {
            @Override
            public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("线程2："+i);
            }
        }
        }).start();

        new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("线程3："+i);
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("线程0："+i);
        }

    }
}
