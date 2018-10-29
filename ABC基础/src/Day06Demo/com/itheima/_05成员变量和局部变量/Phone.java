package Day06Demo.com.itheima._05成员变量和局部变量;

public class Phone {
    // 成员变量
    // 没有static修饰
    // 属于对象的，实例成员变量
    public String name;
    public String brand;
    public double price ;

    public static String schoolName = "黑马";

    // 没有static修饰
    // 属于对象的 实例方法
    public void call(String user){
        System.out.println("给"+user+"拨打电话！");
    }
}
