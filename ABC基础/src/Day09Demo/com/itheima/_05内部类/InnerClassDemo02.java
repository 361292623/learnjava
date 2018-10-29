package Day09Demo.com.itheima._05内部类;
/*
   内部类分为两种：
      按照有无static修饰分为：静态内部类，实例内部类 。
      （1） 静态内部类，（有static修饰，属于外部类的，宿主就是外部类）
           静态内部类属于外部类本身的，静态内部类只有一个，
           他的用法几乎与普通无任何差别，只是他在一个内的里面而已。

           内部类的访问格式是：外部类.内部类。

           静态内部类中的静态方法可以直接访问外部类的静态成员吗？ 完全可以。
           静态内部类中的静态方法可以直接访问外部类的实例成员吗？
              不可以，外部类的实例成员，必须用外部类的对象访问。
           静态内部类中的实例方法可以直接访问外部类的静态成员吗？ 完全可以。
           静态内部类中的实例方法可以直接访问外部类的实例成员吗？
               不可以，外部类的实例成员，必须用外部类的对象访问。
* */
public class InnerClassDemo02 {
    // 实例变量
    private String name ;
    // 静态变量
    public static String out = "外部类out";
    public static void out(){
        System.out.println("==外部类的静态方法===");
    }

    // 静态内部类
    static class Inner{
       // public static String out = "内部类out";
        public static void test1(){
            // 静态内部类中的静态方法可以直接访问外部类的静态成员吗？ 完全可以。
            // 静态内部类中的静态方法可以直接访问外部类的实例成员吗？ 不可以。
            System.out.println(out);
            //System.out.println(name);
            out();
        }

        // 实例方法
        public void test2(){
            // 静态内部类中的实例方法可以直接访问外部类的静态成员吗？ 可以
            // 静态内部类中的实例方法可以直接访问外部类的实例成员吗？ 不可以
            System.out.println(out);
           // System.out.println(name);
            out();
        }

    }
}
