package Day05Demo._01数组的概述和定义方式一;

/*
* 数组的注意事项：
*    (1) 什么类型的数组只能存放什么类型的数据。
*    (2) 数组访问元素的索引必须在范围之类，否则出现程序异常：数组访问越界错误！
*    (3) new关键是用来创建一个新数组的意思，不能省略或者写错的。
*
*
* */
public class ArrayDemo02 {
    public static void main(String[] args){
        // 静态初始化定义一个数组 :
        int[] arrs = new int[]{10,20,30,50,60,40,40};
        System.out.println(arrs.length);
        System.out.println(arrs[0]);
        System.out.println(arrs[6]);
        // 找第8个元素了，但是数组只有7个
       // System.out.println(arrs[7]);
    }
}
