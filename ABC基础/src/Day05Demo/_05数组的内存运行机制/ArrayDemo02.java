package Day05Demo._05数组的内存运行机制;
/*
* 两个数组的内存图：
*
*
* */
public class ArrayDemo02 {
    public static void main(String[] args){
        // 动态初始化一个数组
        double[] scores = new double[4];
        int[] arrs = new int[]{10,20,30};

        System.out.println(scores);
        System.out.println(arrs);

        // 访问arrs数组
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);

        // 给数组scores的索引为2的位置处赋值100.8
        scores[2] = 100.8;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // 基本数据类型的值直接存在变量中(方法栈)
        //int age = 23 ;
        //System.out.println(age);

    }
}
