package Day05Demo._07数组的遍历;
/*
* 数组遍历(遍历)： 就是将数组中的每个元素分别获取出来。
*          遍历也是数组操作中的基石。
*
* 为什么要遍历？
*   例如请从一堆数组元素（分数）中找出最大分数
*   从数组中的全部元素中去看是否存在某个元素。
*/
public class ArrayDemo01 {
    public static void main(String[] args){
        double[] allScores = new double[]{89 ,96 ,100 ,98.5 ,99 ,89.5};
        /*System.out.println(allScores[0]);
        System.out.println(allScores[1]);
        System.out.println(allScores[2]);
        System.out.println(allScores[3]);
        System.out.println(allScores[4]);
        System.out.println(allScores[5]);*/

        // 使用循环遍历数组
        /*for(int i = 0 ; i < 6 ; i++ ){
            System.out.println(allScores[i]);
        }
        */
        // 使用循环遍历数组 ， 获取数组的长度！
        for(int i = 0 ; i < allScores.length ; i++ ){
           /* double score = allScores[i];
            System.out.println(score);*/
           System.out.println(allScores[i]);
        }
    }
}
