package Day05Demo._07数组的遍历;
/*
* 需求：请找出数组中的最大值。
*
* */
public class ArrayExecDemo02 {
    public static void main(String[] args){
        // 定义一个数组
        int[] arrs = new int[]{10,90,80,100,95,60,90};

        // 需求：请找出数组中的最大值。
        // (1)定义一个变量用于保存当前最大值，默认认为第一个元素就是当前最大值
        int maxData = arrs[0];
        // (2)遍历数组中的每个元素依次与当前最大值进行比较，如果比最大值
        //  大，应该替换最大值为这个值！
        for(int i = 0 ; i < arrs.length ; i++ ) {
            int data = arrs[i];
            //   如果比最大值大，应该替换最大值为这个值！
            if(data > maxData){
                // 把data赋值给当前最大值变量
                maxData = data ;
            }
        }

        System.out.println("最大值："+maxData);

    }
}
