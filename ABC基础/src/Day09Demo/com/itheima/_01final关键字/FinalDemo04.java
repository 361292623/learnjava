package Day09Demo.com.itheima._01final关键字;
/*
 * final修饰变量：
 *
 *      总规则：final修饰的变量必须赋值，有且仅能被赋值一次。
 *      目的是为了保护变量。
 *
 *     （1）局部变量
 *           a.方法中的局部变量
 *              -- 这个局部必须在使用前赋值，且只能被赋值一次。
 *              -- 它的修饰符最多只有final。
 *              -- 定义的时候赋值，在使用前赋值一次。
 *
 *           b.{}代码块的局部变量
 *              特点跟方法中的局部变量是一样的。
 *
 *           c.for循环中的局部变量
 *              语法是可以用final修饰，但是for循环将失去意义。
 *
 *           d.方法中的形参的局部变量
 *              final修饰方法形参说明这个参数不能再方法中被修改了。
 *              这个形参就可以达成安全性，不至于被随意修改了。
 *
 *     （2）成员变量
 *           a.final修饰实例成员变量，这个变量可以在初始化的时候赋值一次
 *             以后不能再次被赋值。
 *
 *             final修饰实例变量，可以在构造器中赋值一次
 *             但是是每个构造器中都必须存在一个赋值的语句。
 *
 *          b.静态变量属于类
 *            final修饰静态变量，这个变量可以在定义的时候赋值一次。
 *            此时这个变量变成了所谓的常量。
 *            常量一般用来存放系统的配置信息
 *            常量的变量名称按照规范应该全部大写，多个单词用_链接
 *
 *
 *
 */
public class FinalDemo04 {
    public static void main(String[] args){
        Dog dog = new Dog();


        Dog dog1 = new Dog();

    }
}

class Dog{
    // 实例变量。
    private final String name = "jinMao";

    // 实例变量。
    private final String schoolName ;

    // 静态变量
    public final static int NUM = 111 ;
    public final static String DEAR_OWER = "荒野猎人";
    public final static String USER_NAME = "admin";
    public final static String PASS_WORD = "123456";

    public Dog(){
        schoolName = "宠物学校";
    }

    public Dog(int age){
        schoolName = "宠物学校1";
    }

    public String getName() {
        return name;
    }
}
