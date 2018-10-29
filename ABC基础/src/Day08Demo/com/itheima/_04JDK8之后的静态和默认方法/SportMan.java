package Day08Demo.com.itheima._04JDK8之后的静态和默认方法;
/*
* 接口：
*    在JDK 1.8之前只能是抽象方法。
*    从JDK 1.8之后接口不再纯洁了，接口中还可以存在
*    静态方法，默认方法（实例方法）,为了让接口变得更强大。
*
* */
public interface SportMan {
    void run();
    void eat();

    // 1.静态方法
    static void go(){
        System.out.println("加油！！");
    }

    // 2.默认方法（实例方法）
    // 默认方法就是实例方法，只是语法上要求用default标记以下
    default void sleep(){
        System.out.println("运动员要休息好！");
    }

}
