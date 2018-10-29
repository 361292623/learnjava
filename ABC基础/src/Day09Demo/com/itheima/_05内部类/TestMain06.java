package Day09Demo.com.itheima._05内部类;

public class TestMain06 {

    private String name ;
    private static String name1 ;

    public static void main(String[] args){

    }

    public void test1(){
        // 局部内部类是放在方法中的
        // 宿主是方法
        class B{
            public void testB1(){
                System.out.println(name);
                System.out.println(name1);
            }
        }

        B b = new B();
    }

    public static void test(){
        // 局部内部类是放在方法中的
        // 宿主是方法
        class A{
            private int age ;
            public void testB1(){
                //System.out.println(name); // 不可以
                System.out.println(name1);
            }
        }

        A a = new A();
    }
}
