package Day06Demo.com.itheima._07构造器的封装优化;
/*
* 构造器：
*     一个类默认就有一个无参数构造器
*     但是如果写了一个有参数构造器，那么默认的无参数构造器就被覆盖了。
*
*     有参数构造器的功能：可以在创建对象的时候同时初始化对象的数据。
*
*
*
*/
public class FengZhuangDemo01 {
    public static void main(String[] args) {
       /* People dw = new People();
        dw.setSex('男');
        dw.setAge(21);
        dw.setName("邓伟");
        System.out.println(dw.getAge());
        System.out.println(dw.getName());


        */

        People dw = new People("邓伟",21,'男');
        People dw1 = new People("邓伟1",22,'男');
        System.out.println(dw.getName());
        System.out.println(dw1.getName());
    }
}
