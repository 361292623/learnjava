package Day05Demo._06数组的常用操作;
/*
* 数组越界：
* 空指针异常：
* 这两种需要程序员绝对避免。
*
* */
public class ArrayDemo01 {
    public static void main(String[] args){
        // 定义一个字符串数组
        String[] arrs = new String[3];
        arrs[1] = "你们很棒"; // 给数组的第二个元素赋值成 “你们很棒”
        System.out.println(arrs[0]); // null
        System.out.println(arrs[1]); // "你们很棒"
        System.out.println(arrs[2]); // null
        // System.out.println(arrs[3]); // 越界了,程序在这里就挂了！

        // arrs = null ; // 把数组的变量的引用去掉，数组变量此时没有指向任何数组了
        // 如果再去操作该数组(取长度，取元素，赋值都会报出空指针异常)
        System.out.println(arrs.length);

        System.out.println("程序完成！");
    }
}
