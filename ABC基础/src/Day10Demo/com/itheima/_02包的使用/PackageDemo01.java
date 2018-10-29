package Day10Demo.com.itheima._02包的使用;

import Day10Demo.com.itheima._01API的使用步骤.TestExec;

/*
*  包（package）:
*     包是用于分门别类的管理不同的技术代码。
*     便于拓展和维护技术。
*
*     sun公司的全部技术(API)都会放到不同的包下，
*     如果要给一个类指定到一个包下，必须在类的第一行代码上
*     加上： package 包名;
*
*     包名的规范是：公司域名的倒写，加上项目名称（随意指定）
*        www.itheima.com
*        ->
*        com.itheima.技术名。
*
*     导包：如果要使用某个包下的类，必须先导入这个类。
*       在类上面加上这个包的路径：
*      import com.itheima._01API的使用步骤.TestExec;
*
*      如果要使用Java公司写好的类也必须先导入这个类的包。
*      在Java中默认每个类都已经导入了java.lang包下的类
*      所以lang包下的类无需导入包，可以直接使用。
*
*      但是其他包下的类，必须先导入包，才可以使用！否则报错！
*

*
*
* */
public class PackageDemo01 {
    public static void main(String[] args){
        System.out.println(TestExec.sum(1,2));
    }
}
