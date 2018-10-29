package Day06Demo.com.itheima._06封装;
/*
* 人类
*
*/
public class People {
    // 成员变量,属于对象的，无static修饰
    // 合理隐藏
    private String name ;
    private int age  ;
    private char sex  ;

    public String getName() {
        //return dw.name;
        return this.name;
    }

    public void setName(String name) {
        // dw.name = "邓伟"
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // this ：代表的是当前对象
    //       this出现在方法中，谁调用这个方法，this就代表谁！
    // this == dw
    // this只能用在实例方法和构造器中。
    // 合理暴露：暴露了设置年龄的方法
    public void setAge(int age){
        if(age <= 0 || age >=200 ){
            System.out.println("年龄非法");
        }else{
            // dw.age = 21;
            this.age = age ;
        }
    }

    // 合理暴露：暴露了获取年龄的方法
    public int getAge(){
        return this.age ; // dw.age
    }

    // 属于类的
    public static String desc = "这是人类";

    // 无参数构造器 默认就有的

}
