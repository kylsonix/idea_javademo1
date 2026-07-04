package Demo3;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //Collection集合的整体特点
        //1、List家族的集合：有序，可重复，有索引
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        String s = list.get(2);
        System.out.println(s);


        //2、Set家族的集合：无序，不可重复，无索引
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        System.out.println(set);

        //3、Map家族的集合：无序，可重复，有索引
        Map<String,String> map = new HashMap<>();
        map.put("hello1","world");
        map.put("hello2","java");
        System.out.println(map);
    }

}
