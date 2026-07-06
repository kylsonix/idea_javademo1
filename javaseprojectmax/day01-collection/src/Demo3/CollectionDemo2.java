package Demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //搞清楚Collection集合提供的通用集合功能
        Collection<String> c = new ArrayList<>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

        //获取集合元素的个数
        int size = c.size();
        System.out.println(size);

        //判断集合中是否包含某个元素
        boolean b = c.contains("hello");
        System.out.println(b);

        //删除某个元素
        c.remove("hello");
        System.out.println(c);

        //判断集合是否为空
        System.out.println(c.isEmpty());

        //把集合转换成数组
        Object[] arr = c.toArray();
        System.out.println(arr[0]);

        //清空集合
        c.clear();
        System.out.println(c);



    }
}
