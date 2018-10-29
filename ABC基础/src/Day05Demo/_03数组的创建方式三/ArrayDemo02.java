package Day05Demo._03数组的创建方式三;
/*
*  动态初始化数组的赋值：
*
*
* */
public class ArrayDemo02 {
    public static void main(String[] args){
        // 动初始化一个数组
        double[] scores = new double[6];
        System.out.println(scores.length);
        System.out.println("----------------------------");
        //System.out.println(scores[0]);
        // 数组元素赋值的语法：数组名称[元素的索引位置] = 元素值;
        scores[0] = 80.5;
        scores[1] = 70.5;
        scores[3] = 90.5;
        scores[2] = 60.5;
        scores[4] = 92.5;
        scores[5] = 98.6;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
        System.out.println(scores[5]);

    }
}
