package com.itheima._11常用函数式接口;

import java.util.function.Consumer;

/*
* Consumer是一个泛型接口，是用来消费数据，消费数据的类型取决于泛型变量。
*
* Consumer源码：
*   @FunctionalInterface
    public interface Consumer<T> {
         void accept(T t);

         // JDK 1.8以后的默认方法：从此接口不再纯洁
         default Consumer<T> andThen(Consumer<? super T> after) {
            Objects.requireNonNull(after);
            return (T t) -> { accept(t); after.accept(t); };
         }
    }

  唯一抽象方法是：accept 消费数据的。

  默认方法：andThen(重要的)
      可以连接多个Consumer对象，完成多个连续的操作。

      default Consumer<T> andThen(Consumer<? super T> after) {
            return (T t) -> { this.accept(t); after.accept(t);};
      }

*
* */
public class ConsumerDemo04 {
    public static void main(String[] args) {
        // con1消费数据变大写
        Consumer<String> con1 = s -> System.out.println(s.toUpperCase());
        //con1.accept("itheima喜欢你！"); // 大写

        Consumer<String> con2 = s -> System.out.println(s.toLowerCase());;
        //con2.accept("ITHEIMA喜欢你！"); // 小写

        Consumer<String> con3 = s -> System.out.println("徐磊说："+s);;

        Consumer<String> con4 = s -> System.out.println("传智说："+s);;

        con1.andThen(con2).andThen(con3).andThen(con4).accept("itheimaA欢迎您！！");


        con1.andThen(con2).accept("itheimaA欢迎您！！");
    }
}
