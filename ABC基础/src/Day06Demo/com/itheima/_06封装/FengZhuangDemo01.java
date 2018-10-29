package Day06Demo.com.itheima._06封装;
/*
*  封装：
*      面向对象的三大特征：封装 继承 多态。
*
*  先学习封装：
*      封装是为了让代码的功能更加的安全，让细节被进一步的隐藏起来。
*
*  封装的核心关键修饰符：
*         public : 公开权限，所有地方都可以访问。
*         private: 私有权限，只有当前类中才可以访问！
*  封装的核心思想：
*         合理隐藏,合理暴露。
*         封装的规范：一般来说实例成员变量都应该私有
*                   然后通过方法暴露出去。
*                   方法一般公开权限。
*         但是极个别情况，方法也会私有，成员变量也会公开。
*
*  所以封装的规范代码是这样的：
*         成员变量私有 。
*         方法应该公开。
*         应该为每个私有的成员变量提供成套的 getter + setter方法
* */
public class FengZhuangDemo01 {
    public static void main(String[] args) {
        //
        People dw = new People();
        //dw.name = "邓伟";
       // dw.age = -200 ; // age没有封装，所以可能产生问题数据！
       //System.out.println(dw.age);
        dw.setAge(21); // 为对象的年龄取值！
        dw.setName("邓伟");
        System.out.println(dw.getAge());
        System.out.println(dw.getName());

    }
}
