package Day06Demo.com.itheima._04创建手机类;
/*
 * **************************************************************
 * **************************************************************
 *  Java中最重要的关键字：static。
 *  static == 类 == 静态
 *  static可以修饰成员变量或者修饰方法.
 *
 *  有static修饰成员变量，说明这个成员变量是属于类的，直接用类名访问即可。
 *  这个成员变量称为类变量 或者 静态成员变量。
 *
 *  没有static修饰的成员变量属于每个对象的。
 *  这个成员变量叫实例变量或者叫对象变量。
 *
 *  有static修饰方法，说明这个方法属于类的，直接用类名访问即可。
 *  这个成员变量称为类方法 或者 静态方法。
 *
 *  没有static修饰的方法属于每个对象的。
 *  这个方法叫实例方法或者叫对象方法。
 *
 * ***************************************************************
 * ***************************************************************
 *
 *
 */
public class Phone {
    // 没有static修饰，属于每一个对象，
    // 1.实例成员变量。
    public String name ;  // 名字
    public String brand ; // 品牌
    public String color ; // 颜色
    public double price ; // 价格

    // 有static修饰的，属于类，叫类变量或者叫静态变量
    public static String schoolName = "黑马程序员培训中心";

    // 2.定义无参数构造器
    public Phone(){

    }

    // 3.行为
    // 没有static修饰称为实例方法，属于每一个对象的。
    public void call(String user){
        System.out.println("给"+user+"拨打电话！");
    }

    // 有static修饰的方法是属于类的，静态方法/类方法
    public static void test(){
        System.out.println("test方法");
    }

}
