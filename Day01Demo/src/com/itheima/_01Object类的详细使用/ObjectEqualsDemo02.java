package com.itheima._01Object类的详细使用;
/*
 * Object类：
 *     Object类是Java中的祖宗类。
 *     一个类要么默认继承了Object类 (extends Object)
 *     要么直接继承了Object类。
 *     要么间接继承了Object类。
 *
 *     Object类的翻译（对象），一切皆对象。
 *
 *     所以其实所有的类都相当于继承了Object类，
 *     所以学习Object类中的方法（API）,那么一切类都可以使用这些方法（功能）。
 *
 * Object类中的常用方法：
 *     （1）public String toString()
 *          默认是返回对象在堆内存中的地址的。
 *          地址格式：类的全限名@对象在堆内存中的地址
 *          举例：com.itheima._01Object类的详细使用.Student@5f150435
 *
 *          输出对象如果输出是对象的堆内存地址，在开发的时候通常是没有意义的。
 *          开发的时候输出对象，更多的时候希望看到对象中的数据，而不是地址。
 *          所以toString()方法存在的价值是为了被子类重写，以便输出对象的数据。
 *
 *
 *          注意：直接输出对象，对象默认会调用自己的toString()方法
 *               所以直接输出对象，可以省略toString()不写，默认会自动调用！
 *
 *     （2）public boolean equals(Object obj)
 *          默认是用于比较两个引用变量的地址是否一样。
 *          也就是默认是比较两个引用变量是否是指向同一个对象。
 *
 *          如果只是想比较两个引用变量地址是否相同，完全没有必要用equals比较
 *          “==”完全可以替代它。
 *
 *          equals存在的意义也是为了被子类重写，以便程序员自己来指定比较规则。
 *          例如：需求，只要两个对象的名称，年龄，性别，班级一样我们就认为是同一个对象
 *               这时候需要程序员通过重写equals方法来自己指定比较规则
*
*           注意：字符串的比较应该使用equals,因为字符串自己已经重写了equals方法
*                只关心字符串的内容一样就一定返回true.
*                以后字符串的比较建议全部使用equals比较
* */
public class ObjectEqualsDemo02 {
    public static void main(String[] args){
        // 创建一个学生对象
        Student zzj =  new Student("蜘蛛精",999,'女',"98期就业班");
        Student zzj1 = new Student("蜘蛛精",999,'女',"98期就业班");

       // boolean rs = zzj.equals(zzj);
        //System.out.println(zzj.equals(zzj));
        System.out.println(zzj.equals(zzj1)); // true

       /* System.out.println(zzj == zzj);
        System.out.println(zzj == zzj1);*/

       String name = "itheima";
       String name1 = new String("itheima");
       System.out.println(name == name1);
       System.out.println(name.equals(name1));
    }
}
