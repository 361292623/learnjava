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
*
*/
public class FinalDemo03 {
    public static void main(String[] args){
        final int age = 23 ; // 方法中的局部变量

         //final String name = "itheima";
        final String name;
        name = "itheima";
        System.out.println(name);

        {
            final int num = 100;
            final int num1 ;
            num1 = 111;
        }

        /*for( final int i = 0 ; i < 10 ; i++ ) {

        }*/

        sum(10,20);
    }

    public static void sum(final int a ,final int b){
        System.out.println(a + b);
    }
}
