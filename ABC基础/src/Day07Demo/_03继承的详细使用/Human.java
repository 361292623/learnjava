package Day07Demo._03继承的详细使用;
/*
* 继承：
*    继承是面向对象的三大特征之一：(封装 ，继承 ，多态)
*    继承是出现在子父类之间的关系。
*    学生类继承了人类。
*    老师类继承了人类。
*    猫继承了动物类。
*
*    Java中类与类之间也存在继承关系。
*    为什么要有继承关系？
*       原因是当一个系统存在学生类，老师类，员工类的时候
*       这些类中存在很多想多共同的成员变量。
*       “继承可以提高代码的复用程度”，相同的成员变量和方法放到父类中去。
*       子类直接继承父类就可以得到父类的所有成员变量和方法。
*
*  继承：就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。子类可以直接
   访问父类中的非私有的属性和行为
*
*  继承的格式：
*       子类 extends 父类;
* */
public class Human {
    // 合理隐藏
    private String name ;
    private char sex ;
    private int age ;
    private double height ;
    private double weight ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
