package com.itheima._03反射_获取Class类对象;
/*

* 反射为所有的类设计了一个类类型：Class
*   类对象化。指的class文件的类型。
*
* 反射的第一步永远是现获取类对象：类名.class
    * 方式1: 通过类名.class获得
    * 方式2：通过对象名.getClass()方法获得
    * 方式3：通过Class类的静态方法获得： static Class forName("类全名")
    每一个类的Class对象都只有一个

  Class类的常用方法：
    String getSimpleName(); 获得类名字符串：类名
    String getName();  获得类全名：包名+类名
    T newInstance() ;  创建Class对象关联类的对象

*
* */
public class ClassDemo01 {
    public static void main(String[] args) throws Exception{
        // 方式1: 通过类名.class获得
        Class<?> clazz = Student.class;

        // 方式2：通过对象名.getClass()方法获得
        Student stu = new Student();
        Class<?> clazz1 = stu.getClass();

        // 方式3：通过Class类的静态方法获得
        // 是最好的！！
        Class<?> clazz2 = Class.forName("com.itheima._03反射_获取Class类对象.Student");

        // 方法1：获取类名（简名）
        System.out.println(clazz2.getSimpleName());
        // 方法2：获取类的全限名
        System.out.println(clazz2.getName());

        // 方法3：创建Class对象关联类的对象  newInstance() ;
        //Student stu1 = (Student) clazz1.newInstance();

        // 先去Class对象中获取一个无参数的构造器，然后创建对象。
        // 可读性好！
        Student stu2 = (Student) clazz.getDeclaredConstructor().newInstance();
        System.out.println(stu2);

        // 拓展！反射访问有参数构造器
        Student stu3 = (Student) clazz.getDeclaredConstructor(String.class,int.class,String.class)
                .newInstance("孙悟空",40,"98期");
        System.out.println(stu3);
    }
}
