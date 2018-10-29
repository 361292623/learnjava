package Day09Demo.com.itheima._04代码块;
/*
 *  代码块：
 *     代码块是类的五大金刚之一。
 *     类的五大成分：构造器，成员变量，方法，代码块， 内部类。
 *
 *     代码块分为两种：静态代码块（有static修饰，属于类）
 *                  实例代码块（没有static修饰，属于对象）
 *
 *     静态代码块：
 *        static{
 *
 *        }
 *        一启动类就会自动的触发静态代码块的执行。
 *        静态代码块一般用于在类启动的时候先初始化系统需要的一些数据
 *
 *     实例代码块：
 *        {
 *
 *        }
 *         每次创建对象，实例代码块都会执行一次。
 *         实例代码块中的代码实际上最终会提到每个构造器中的前面去执行
 *
 *
 */
public class DaiMaKuaiDemo02 {

    private final String scName = "heima";
    private final String scName1;
    {
        scName1 = "heima";
        System.out.println("实例代码块！");
    }

    public DaiMaKuaiDemo02(){

    }

    public DaiMaKuaiDemo02(String name){

    }

    public static void main(String[] args){
        new DaiMaKuaiDemo02();
        new DaiMaKuaiDemo02();
        new DaiMaKuaiDemo02("张三");
    }
}
