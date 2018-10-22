package _02递归;
/*
 * 递归的概念：
 *    方法在自己的方法体中又调用自己。（自己调用自己）。
 *
 * 递归的调用方式：
 *    直接调用：自己调用自己
 *    间接调用：自己调用别人，别人由回来调用自己。
 *
 * 递归是会出现死循环的。
 * java.lang.StackOverflowError：栈内存溢出错误：递归进入了死循环。
 *
 *
 */
public class DiGuiDemo01 {
    public static void main(String[] args) {
       // test1();
        test2();
    }

    public static void test2(){
        System.out.println("==test2==");
        test3();
    }

    public static void test3(){
        System.out.println("==test3==");
        test2();
    }

    public static void test1(){
        System.out.println("===test1==");
        test1();
    }
}
