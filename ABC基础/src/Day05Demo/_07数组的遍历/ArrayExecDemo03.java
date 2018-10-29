package Day05Demo._07数组的遍历;
/*
 * 需求：请将数组中的元素进行反转
 *
 *      例如我给你这样一个数组：
 *      int[] arrs = new int[]{1,2,3,4,5};
 *      System.out.println(arrs); // [1,2,3,4,5]
 *      // 请进行元素的反转
 *      System.out.println(arrs); // [5,4,3,2,1]
 *
 *
 */
public class ArrayExecDemo03 {
    public static void main(String[] args){
        int[] arrs = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i = 0 ; i < arrs.length ; i++ ){
            System.out.print(arrs[i]+"  ");
        }
        // 请进行元素的反转
        // 最后一个元素的索引位置是: 数组的长度-1
        for(int i = 0 , j = arrs.length -1 ; i < j ; i++ , j--){
            // 先定义一个临时变量存放i位置的值
            int temp = arrs[i];
            // 再把j位置的值赋值给i
            arrs[i] = arrs[j];
            // 再把临时存放的i位置的值赋值给j
            arrs[j] = temp;
        }

        System.out.println();
        for(int i = 0 ; i < arrs.length ; i++ ){
            System.out.print(arrs[i]+"  ");
        }
    }
}
