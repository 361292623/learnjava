package Day05Demo._05数组的内存运行机制;
/*
*  两个变量指向了同一个数组。
*     无论是哪个变量操作数组都是操作的同一个数组，
*     所以大家都可以修改和访问这个数组的元素。
*
* */
public class ArrayDemo03 {
    public static void main(String[] args){
        int[] arrs = new int[4]; // arrs == [I@c39f790;
        System.out.println(arrs);

        arrs[1] = 111;
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
        System.out.println(arrs[3]);

        // 定义一个数组
        // 把arrs数组变量赋值给arrs1
        // arrs1 = [I@c39f790;
        // 也就是 arrs1存放的地址和arrs的地址是完全一样的，她们都指向了同一个数组。
        int[] arrs1 = arrs ;
        //System.out.println(arrs1);
        arrs1[3] = 222;
        System.out.println("----------------------");
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
        System.out.println(arrs[3]);

        //  拓展
        // 引用类型的默认值是null
        // 让arrs1不再指向数组。
        arrs1 = null ;
        // NullPointerException 空指针异常
        arrs1[2] = 333;

    }
}
