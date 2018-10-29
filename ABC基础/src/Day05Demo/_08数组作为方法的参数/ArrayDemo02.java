package Day05Demo._08数组作为方法的参数;
/*
   数组作为方法的返回值类型。
*  请返回一个 1-4的数组
*
* */
public class ArrayDemo02 {
    public static void main(String[] args){
        int[] ars = getArr();

        for(int i = 0 ; i < ars.length ; i++ ){
            System.out.print(ars[i]+"\t");
        }
    }

    // 方法的参数： 无
    // 返回值类型 ：int[](数组类型，int类型的数组)
    public static int[] getArr(){
        int[] arrs = new int[]{1,2,3,4};
        // 返回的是一个int类型数组的地址！
        return arrs ;
    }
}
