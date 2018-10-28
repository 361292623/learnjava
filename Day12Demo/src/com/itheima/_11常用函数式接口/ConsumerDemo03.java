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
*
* */
public class ConsumerDemo03 {
    public static void main(String[] args) {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // 消费数据
                System.out.println(s.toUpperCase());
            }
        };

        Consumer<String> con1 = s -> System.out.println(s.toUpperCase());
        Consumer<String> con2 = s -> System.out.println(s);
        Consumer<String> con3 =  System.out::println;

        con.accept("Dlei");
        con2.accept("itheima欢迎您！");
        con3.accept("itheima欢迎您！");
    }
}
