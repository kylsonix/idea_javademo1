package proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //创建一个明星对象的代理对象返回
    public static <T>T createProxy(T s) {
        /*
         * 参数一:用于执行用哪个类加载器去加载生成的代理类
         * 参数二:用于指定代理类实现的所有接口
         * 参数三:用于指定代理类如何执行被代理类方法
         * */
        T proxy = (T)Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //用来声明代理对象要干的事情
                //参数一:proxy接受到的代理对象本身
                //参数二:method接受到代理对象调用的方法（正在被代理的方法）
                //参数三:args接受到代理对象调用方法时传递的参数
                String methodName = method.getName();
                if ("sing".equals(methodName)) {
                    System.out.println("代理对象开始执行被代理对象的sing方法");
                }else if ("dance".equals(methodName)) {
                    System.out.println("代理对象开始执行被代理对象的dance方法");
                }
                Object result = method.invoke(s, args);
                System.out.println("代理对象结束执行被代理对象方法");
                return result;
            }
        });
        return proxy;
    }
}
