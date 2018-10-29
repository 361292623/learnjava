package Day09Demo.com.itheima._05内部类;
/*
   内部类分为两种：
      按照有无static修饰分为：静态内部类，实例内部类 。
      （1） 静态内部类，（有static修饰，属于外部类的，宿主就是外部类）
           静态内部类属于外部类本身的，静态内部类只有一个，
           他的用法几乎与普通无任何差别，只是他在一个内的里面而已。

           内部类的访问格式是：外部类.内部类。

           静态内部类中的静态方法可以直接访问外部类的静态成员吗？ 完全可以。

           静态内部类中的静态方法可以直接访问外部类的实例成员吗？
              不可以，外部类的实例成员，必须用外部类的对象访问。

           静态内部类中的实例方法可以直接访问外部类的静态成员吗？ 完全可以。

           静态内部类中的实例方法可以直接访问外部类的实例成员吗？
               不可以，外部类的实例成员，必须用外部类的对象访问。

      (2)实例内部类(无static修饰的，属于外部类的对象的，宿主是外部类对象 )
           实例内部类中是否可以有静态成员?不能有
           实例内部类的实例方法可以访问外部类的静态成员吗？ 可以。
           实例内部类的实例方法可以访问外部类的实例成员吗？ 可以。
*
*/
public class InnerClassDemo04 {

    public static int age = 12 ;
    public int age1 = 12 ;

    // 实例内部类
    public class InnerClass{
        // 实例变量
        private String name ;
        // 实例内部类中是否可以有静态成员?不能有
     /*   public static String flag ;

        public static void test(){

        }*/

        public void test(){
            System.out.println(age);
            System.out.println(age1);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public InnerClass(){

        }
    }
}
