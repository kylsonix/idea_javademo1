package proxydemo;

public class Test {
    public static void main(String[] args) {
        //目标：创建一个代理对象
        //1、准备一个明星对象：设计明星类
        Star star = new Star("章若楠");
        //2、为明星类创建代理对象：代理类继承Proxy类，实现InvocationHandler接口
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《夜空中最亮的星》");
        System.out.println(proxy.dance());
    }
}
