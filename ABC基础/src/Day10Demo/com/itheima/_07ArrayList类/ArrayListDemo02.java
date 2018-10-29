package Day10Demo.com.itheima._07ArrayList类;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
  ArrayList就是一种可变数组，所以元素也是存在索引的。
* ArrayList的常用方法：
*
*
* */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("徐明明");
        names.add(12);
        names.add("杨斌");
        names.add("马里红");
        names.add(true);
        names.add(true);

        //[徐明明, 12, 杨斌, 马里红, true, true]
        System.out.println(names);

        // 返回元素的总个数
        System.out.println(names.size());

        // 根据索引取元素
        System.out.println(names.get(3));

        // 根据索引删除元素
        System.out.println(names.remove(1));
        System.out.println(names);

    }
}
