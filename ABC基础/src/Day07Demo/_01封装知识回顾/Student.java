package Day07Demo._01封装知识回顾;
// 面向对象思想：模拟现实世界的事物。
// 学生类： 类
// 周超 ：  对象
public class Student {
    // 实例变量 ： 无static修饰
    private String name ;
    // 年龄
    private int age ;
    // 性别
    private char sex ;

    public void setSex(char sex){
        if(sex == '男' || sex == '女'){
            this.sex = sex ;
        }else{
            System.out.println("性别有问题！");
        }
    }

    public char getSex(){
        return this.sex; // zc.sex
    }


    // this代表的是当前对象
    // this出现在方法中，谁调用这个方法，this就代表谁！
    public void setAge(int age){
        if(age <= 0 && age >= 200){
            System.out.println("年龄非法");
        }else{
            this.age = age; // zc.age = 21;
        }
    }

    // 合理暴露
    public int getAge(){
        return this.age; // zc.age
    }


}
