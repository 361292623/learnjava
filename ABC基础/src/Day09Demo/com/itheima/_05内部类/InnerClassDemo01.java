package Day09Demo.com.itheima._05内部类;
/*
* 内部类的概念：
*    内部类是类的五大成分之一。
*    将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类。
*    也有其他概念： A是寄生类， B是宿主类。
*
*  什么时候使用内部类
        一个事物内部还有一个独立的事物，内部的事物脱离外部的事物无法独立使用
        1. 人里面有一颗心脏
        2. 汽车内部有一个发动机

   内部类提供了更好的封装性，内部类属于外部类的，内部类本身存在权限修饰符
   内部类里面的东西又存在权限修饰符，封装性更加的紧密。

   什么时候用内部类呢？
        几乎不用，内部类是可遇不可求的，通常都是别的框架在用，我们要学会使用。

   内部类分为两种：
      按照有无static修饰分为：静态内部类，实例内部类 。

      （1） 静态内部类，（有static修饰，属于外部类的，宿主就是外部类）
           静态内部类属于外部类本身的，静态内部类只有一个，
           他的用法几乎与普通类无任何差别，只是他在一个内的里面而已。

           内部类的访问格式是：外部类.内部类。

*
*
*/
public class InnerClassDemo01 {

    public static void main(String[] args){
        // 调用内部类的静态成员
        System.out.println(InnerClass.flag);
        InnerClass.test();

        // 调用内部类的实例成员
        //InnerClassDemo01.InnerClass innerClass = new InnerClassDemo01.InnerClass();

        InnerClass innerClass1 = new InnerClass();
        innerClass1.setName("张三");
        System.out.println(innerClass1.getName());
    }

    //  静态内部类
    public static class InnerClass{
        // 1.实例成员
        private String name;

        // 静态成员
        public static String flag = "内部类的静态变量";

        public static void test(){
            System.out.println("内部类test");
        }

        public InnerClass(){
            System.out.println("内部类");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
