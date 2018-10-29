package Day10Demo.com.itheima._07ArrayList类;

import java.util.ArrayList;

/*
* ArrayList集合的遍历
*
*   Object类是一切类的父类，是一个祖宗类。
*    一个类要么直接继承了Object类
*    要么默认继承了Object类
*    要么间接继承了Object
*
* */
public class ArrayListDemo03{
    public static void main(String[] args){
        ArrayList names = new ArrayList();
        names.add("徐明明");
        names.add(12);
        names.add("杨斌");
        names.add("马里红");
        names.add(true);
        names.add(true);
        System.out.println(names);

        // 遍历ArrayList数组
        for(int i = 0 ; i < names.size() ; i++ ) {
            // Object类型可以接收一切类型，因为它的范围最大。
          /*  Object ele = names.get(i);
            System.out.println(ele);*/
          System.out.println(names.get(i));
        }
    }
}
