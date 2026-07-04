package Demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo1 {
    public static void main(String[] args) {
        //掌握Collection集合的遍历方式
        //一、迭代器遍历
        Collection<String> names = new ArrayList<>();
        names.add("宋青书");
        names.add("张无忌");
        names.add("张三丰");
        names.add("殷素素");
        System.out.println(names);

        //得到集合的迭代器对象
        Iterator<String> it = names.iterator();
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        //while循环遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        //for循环遍历
        for (String name : names) {
            System.out.println(name);
        }

        //Lambda表达式遍历
        //names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

    }
}
