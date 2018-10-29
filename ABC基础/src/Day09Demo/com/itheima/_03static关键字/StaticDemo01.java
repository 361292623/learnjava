package Day09Demo.com.itheima._03static关键字;
/*
* static == 静态 == 类
*
* （1） static可以修饰成员变量，方法 ，内部类，代码块。
*      static修饰的东西永远属于类，与类一起加载，只有一份。
*
* （2）static修饰的变量：静态变量/类变量
*     static修饰的方法：静态方法/类方法
*     static修饰的内部类：静态内部类
*     static修饰的代码块：静态代码块
*     static修饰的东西直接用类名.访问。
*
*     如果在一个类中访问该类的静态成员可以省略类名调用,默认会加上类名。
*     类是不能直接访问实例成员。
*     静态方法中可以直接访问实例成员吗？不可以的，必须创建对象才能访问
*     静态方法中可以直接访问静态成员？可以的，因为都在同一个类中。
*
*     类名.静态方法
*     类名.静态变量
*
* （3）没有static修饰的成员属于对象/实例
*     没有static修饰的变量：实例变量/对象变量
*     没有static修饰的方法：实例方法/对象方法
*     没有static修饰的内部类：实例内部类 / 对象内部类
*     没有static修饰的代码块：实例代码块
*
*     没有static修饰的东西，必须先创建对象，再用对象访问。
*     对象能访问静态成员吗?
*         可以的，但是这个语法非常的垃圾，静态成员完全没有必须用对象去访问
*         直接用类名访问即可。面试的时候如果遇到用对象来访问静态成员
*         可以改成用类名来访问再解答题目。
*
*     实例方法中可以直接访问实例成员吗？ 可以的。
*     实例方法中可以直接访问静态成员吗? 可以的。
*
*      对象.实例方法
 *     对象.实例变量
*
* */
public class StaticDemo01 {
    public StaticDemo01(){

    }

    public static int age = 12;


    public static void test(){
//        静态方法
        System.out.println("test()");
    }

    public void run(){
//        实例方法
        System.out.println("run()");

    }

    public static void main(String[] args){
        //StaticDemo01.test();
        test();

        StaticDemo01 s = new StaticDemo01();
        s.run();
        s.test();

    }

}
