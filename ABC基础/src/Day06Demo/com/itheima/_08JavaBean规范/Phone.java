package Day06Demo.com.itheima._08JavaBean规范;
/*
* JavaBean 是 Java语言编写类的一种标准规范。
* 符合 JavaBean 的类，要求类必须是具体私有的成员变量和公共的方法，并且具有无
  参数的构造方法，和有参数构造方法(可选), 提供用来操作成员变量的 set 和 get 方法
*
* */
public class Phone {
    private String name ;
    private int age ;
    private char sex ;

    public Phone() {

    }

    // （可选)
    public Phone(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
