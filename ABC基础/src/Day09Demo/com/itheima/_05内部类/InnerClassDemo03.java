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

*
*/
public class InnerClassDemo03 {

    public static void main(String[] args){
        // 实例内部类必须先创建外部类对象：外部类对象才是内部类的宿主。
        InnerClassDemo03 out = new InnerClassDemo03();
        // 内部类类型：外部类.内部类
        // 内部类对象的创建：宿主.new 寄生类。
        InnerClass inner = out.new InnerClass();

        inner.setName("张三");
        System.out.println(inner.getName());
    }

    // 实例内部类
    public class InnerClass{
        private String name ;

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
