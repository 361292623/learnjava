package Day11Demo.com.itheima._04Arrays类;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
* java.util.Arrays
* 此类包含用来操作数组的各种方法，
* 比如排序和搜索等。
* 其所有方法均为静态方法，调用起来
  非常简单
*
* 方法：
*     public static String toString(Object[] a)
*       输出当前数组的数据内容。
*      Arrays.sort(scores); // 默认从小到大进行排序！
* */
public class ArraysDemo01 {
    public static void main(String[] args) {
        // 创建一个数组。
        String[] names = new String[]{"黄彪","严斌","万家志"};
        System.out.println(Arrays.toString(names));

        Integer[] scores = new Integer[]{30,10,40,60,20,50};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores); // 默认从小到大进行排序！
        System.out.println(Arrays.toString(scores));


       /* // 降序！！
        Arrays.sort(scores, ( o1,  o2) ->  o1 - o2);
        System.out.println(Arrays.toString(scores));*/

    }
}
