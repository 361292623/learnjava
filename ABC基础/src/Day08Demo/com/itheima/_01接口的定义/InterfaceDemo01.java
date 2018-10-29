package Day08Demo.com.itheima._01接口的定义;
/*
* 接口：
*    接口是一种更加彻底的抽象。
*    接口中全部是抽象方法，而抽象类里面既可以有普通方法也可以有抽象方法。
*    接口也是不能创建对象的。
*
* 接口的定义格式:
*    [修饰符] interface 接口名称{
*
*    }
*
*    修饰符： public | 缺省
*    接口名称：首字母大写，满足“驼峰模式”
*
* 注意事项：
*    接口中定义的抽象方法，是无需加上public abstract修饰，默认会自动加上。
*    接口也是不能创建对象的。
*    接口中全部是抽象方法。
*    接口中是没有构造器的。
*    接口中定义的成员变量都是常量，默认会加上public static final
*       常量是静态变量（属于类的，只有一个），它必须确定值（因为有final）
*       所以public static final修饰的变量是常量，也就是值定义出来
*       就永远不可变。
 *
*/
public interface InterfaceDemo01 {

    // 实例变量：没有static修饰！
    // public static final java.lang.String name;
    String name = "itheima" ;

    // public static final int age
    int age = 23;

    void sing1();
    void sing();
    void run();
    // 接口中的抽象方法是无需加上public abstract修饰的。
    // 默认会加上：public abstract
    String showName();

}
