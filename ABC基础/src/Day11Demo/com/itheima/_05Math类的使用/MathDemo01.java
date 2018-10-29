package Day11Demo.com.itheima._05Math类的使用;
/*
* java.lang.Math 类包含用于执行基本数学运算的方法，
* 如初等指数、对数、平方根和三角函数。类似这样的工具
  类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。
*
* */
public class MathDemo01 {
    public static void main(String[] args) {
        // 取绝对值
        /*double d1 = Math.abs(-5); //d1的值为5
        double d2 = Math.abs(5); //d2的值为5
        System.out.println(d1);
        System.out.println(d2);*/

        // 向上取整。
/*      double d1 = Math.ceil(3.3); //d1的值为 4.0
        double d2 = Math.ceil(-3.3); //d2的值为 -3.0
        double d3 = Math.ceil(5.1); //d3的值为 6.0
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);*/

        // 向下取整
      /*  double d1 = Math.floor(3.9); //d1的值为3.0
        double d2 = Math.floor(-3.3); //d2的值为‐4.0
        double d3 = Math.floor(5.99999); //d3的值为 5.0
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);*/
      
        
        // 四舍五入
  /*      long d1 = Math.round(5.5); //d1的值为6.0
        long d2 = Math.round(5.4); //d2的值为5.0
        System.out.println(d1);
        System.out.println(d2);*/

        System.out.println(Math.pow(2,8)); // 256

        // NaN非数，不是数 属于double类型
        // Infinity 正无穷大 属于double类型
        // -Infinity 负无穷大 属于double类型
        System.out.println(Math.sqrt(9));
        System.out.println(9.0/0);
        double d1 = -9.0/0;
        System.out.println(d1);
    }
}
