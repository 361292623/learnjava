package Day05Demo._02数组的定义方式二;
/*
* 数组的定义方式二：
*    （1)也是一种静态初始化写法
*         数据类型[] 数组名称 = {元素1,元素2,元素3,...};
*         只是简化了代码的写法,依然是静态初始化的。
*
* */
public class ArrayDemo01 {
    public static void main(String[] args){
        // 创建一个数组
        double[] allScores = {89 ,96 ,100 ,98.5 ,99 ,89.5};
        // 获取数组的长度
        System.out.println(allScores.length);
        // 访问数组的元素
        System.out.println(allScores[0]);
        System.out.println(allScores[1]);
        System.out.println(allScores[2]);
        System.out.println(allScores[3]);
        System.out.println(allScores[4]);
        System.out.println(allScores[5]);

        // System.out.println(allScores[6]); // 执行报错，数组越界了

    }
}
