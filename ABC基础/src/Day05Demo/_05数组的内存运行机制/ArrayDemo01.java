package Day05Demo._05数组的内存运行机制;
/*
*  JVM虚拟机在内存中：
*  JVM虚拟机内存划分：
*       寄存器 给CPU使用，和我们开发无关。
        本地方法栈 JVM在使用操作系统功能的时候使用，和我们开发无关。
        方法区 存储可以运行的class文件。
        堆内存 存储对象或者数组，new来创建的，都存储在堆内存。
        方法栈 方法运行时使用的内存，比如main方法运行，进入方法栈中执行。
*
*  现阶段需要掌握：
*       堆内存：所有的对象，也就是new出来的东西全部是放在堆内存的，
*             数组就是在堆内存中的。
*
*       方法栈：运行的方法名称和变量都是存在方法栈中的。
*
* */
public class ArrayDemo01 {
    // 研究一个数组的内存图
    public static void main(String[] args){
        // 创建一个数组
        // 动态初始化数组
        int[] arrs = new int[5];

        // [I@71e7a66b arrs变量存放的是数组在堆中的地址。
        // 认为：arrs变量指向了堆中的这个数组对象，或者叫引用了这个数组对象
        System.out.println(arrs);
        System.out.println(arrs[2]);
    }
}
