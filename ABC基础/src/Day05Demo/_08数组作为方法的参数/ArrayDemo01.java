package Day05Demo._08数组作为方法的参数;
/*
* 1.输出一个整形数组的所有元素
*   定义一个方法将数组元素输出的功能封装起来。
*
* */
public class ArrayDemo01 {
    public static void main(String[] args){
        int[] arrs = new int[]{1,2,3,4};
        int[] arrs1 = new int[]{1,2,3,4,5,6,7};
        int[] arrs2 = new int[]{11,22,32,3,3,3,3,22,4,5,6,7};
        printArr(arrs);
        printArr(arrs1);
        printArr(arrs2);

    }

    /*
    *  方法的参数：   就是数组  int[] arrs
    *              int[]数据类型：引用类型
    *              arrs :  参数变量
    *  方法的返回值： 无
    */
    public static void printArr(int[] arrs){
        for(int i = 0 ; i < arrs.length ; i++ ) {
            System.out.print(arrs[i]+" ");
        }
        System.out.println(); // 换行！
    }
}
