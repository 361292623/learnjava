package Day05Demo._03数组的创建方式三;
/*
*  数组的创建方式三：
*      （1）动态初始化创建数组
*          数组类型[] 数组变量 = new 数据类型[数组的长度];
*
*
* 动态初始化数组的特点：
*       a.事先不罗列出数组的具体元素,数组中存储的是元素类型的默认值。
*         所有的数值类型的默认是0，0.0
*         布尔类型的默认值是false
*         char类型的默认值是 空字符
*         引用类型的默认值是null
*
*       b.必须先给出数组的长度，这个长度就限定死类数组只能存放这么多个元素。
*
*
*/
public class ArrayDemo01 {
    public static void main(String[] args){
        // 动初始化一个数组
        double[] scores = new double[6];
        System.out.println(scores.length);
        System.out.println(scores[0]);

        boolean[] flags = new boolean[4];
        System.out.println(flags.length);
        System.out.println(flags[0]);

        char[] chs = new char[3];
        System.out.println(chs.length);
        System.out.println(chs[0]);
    }
}
