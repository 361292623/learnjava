package Day09Demo.com.itheima._02权限修饰符;
/*
权限修饰符:
   在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，
   被修饰的内容会有不同的访问权限，

   权限修饰符可以修饰成员变量，修饰方法，修饰内部类。

    public：公共的。        当前类 当前包 其他任何地方都可以直接访问。
    protected：受保护的     当前类 当前包 在子类中都可以直接访问。
    缺省：默认的            当前类 当前包 访问。
    private：私有的        当前类 访问。

    public > protected > 缺省 > private

*/
public class FengZhuangDemo01 {
    public static void main(String[] args){
       // System.out.println(Student.age);
        Student stu = new Student();
        //stu.test();
    }
}


class Student{
    private static int age = 12 ;

    private void test(){

    }
}