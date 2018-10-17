package com.itheima.作业.训练5;
//往HashSet中添加字符串"zhangsan", "lisi","wangwu", "zhangsan".使用迭代器获取HashSet中的元素.
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String > hs = new HashSet<>();
        hs.add("第一元素");
        hs.add("第二元素");
        hs.add("第三元素");
        hs.add("第四元素");
        hs.add("第五元素");
        hs.add("第七元素");
        hs.add("第八元素");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
