package Day06Demo.com.itheima._03类与对象的创建方式;
/*
* 创建类：
*     类是相同事物共同特征的描述。
*     研究类的格式：
*     [修饰符] class <类名>{
*           // 1.成员变量（属性） Field
*           // 2.成员方法 (行为) Method
*           // 3.构造器 （创建类的对象的）    Constructor
*           // 4.内部类
*           // 5.代码块
*     }
*
*     注意：
*       a.修饰符: public | 缺省。
*       b.类名：首字母应该大写，满足”驼峰模式“。
*       c.一个Java代码中可以写多个类，但是只能有一个类是用public修饰的
*        public修饰的类名必须成为Java代码的文件名。
*        开发的时候尽量不要再一个java代码中定义多个类（不规范）
*       d.类中有且仅有5种成分，我把他们称为”5大金刚"
*
*     需求: 定义一个学生类来模拟学生。
*          学生有哪些属性呢(成员变量)：性别，年龄，姓名，班级，地址，电话，..
*          开发只定义需要的属性即可。
*
*    （1）研究成员变量。
*         成员变量是用来描述类的属性的。
*         格式：
*            [修饰符] <数据类型> <变量名称> [=初始值];
*
*         注意：
*            修饰符：public|private|protected|缺省，static,final,transient;
*                  暂时用public
*
*            数据类型：基本数据类型，引用数据类型。
*            变量名称：必须是合法的标识符，首字母应该小写，满足"驼峰模式"
*            初始值：可有可无。
*
*    (2) 研究成员方法。
*         成员方法是用来描述类或者是对象的行为的。
*
*         格式：
*            [修饰符] <返回值类型> <方法名称>([形参列表]){
*               // 方法体代码（执行代码）
*            }
*
*            修饰符：public|private|缺省｜protected , static , final|abstract
*                  public static
*            返回值类型：基本数据类型，引用数据类型。
*            方法名称：首字母小写”满足驼峰模式“
*            形参列表：可有可无的。
*
*     （3）研究构造器
*          构造器是用来创建类的对象的。
*          构造器的格式：
*           [修饰符] 类名([形参列表]){
*               // 构造体代码，执行代码
*           }
*
*          修饰符：public|private|protected|缺省
*          类名：必须是当前构造器所在类的类名。
*          形参列表：可有可无。
*          注意：
*             无参数构造器:无参数构造器是默认存在的，即使不写也会存在这个构造器
*
*
*/
public class Student {
    //  学生有哪些属性呢(成员变量)：性别，年龄，姓名，班级，地址，电话，..
    // 1.成员变量
    public String name ;

    public char sex ; // '男'  '女'

    public int age;
    // 班级
    public String className;
    // 家庭地址
    public String address ;
    // 电话
    public String tel ;
    // 邮箱
    public String email ;
    // 身高
    public double height ;
    // 体重
    public double weight ;

    // 3.构造器
    // 无参数构造器:无参数构造器是默认存在的，即使不写也会存在这个构造器
    public Student(){

    }

    // 2.方法：行为
    public void run(){
        System.out.println("学生可以跑步");
    }

    public  void sleep(){
        System.out.println("学生睡觉");
    }

    public void study(){
        System.out.println("学生在认真上课");
    }

}

/*
class Cat{

}*/
