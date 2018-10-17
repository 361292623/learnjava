package com.itheima._01Object类的详细使用;

import java.util.Objects;

public class Student {
    private String name ;
    private int age;
    private char sex ;
    private String className ;

    // 重写toString()方法是为了输出对象的数据，而不是地址。
  /*  @Override
    public String toString(){
        return "name="+this.name +",age="+this.age +",sex="+this.sex
                +",className="+this.className;
    }*/

    // 自动生成toString()方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", className='" + className + '\'' +
                '}';
    }

    // 重写equals以便自定来指定比较规则：
    // 只要两个对象的名称，年龄，性别，班级一样我们就认为是同一个对象
    // zzj.equals(zzj1) :
    // 比较者：    zzj    ==>  this
    // 被比较者：  zzj1   ==>  obj
    /* @Override
    public boolean equals(Object obj){
        // 学生必须与学生比较，判断obj是否是学生类型。
        // obj对象必须是学生类或者学生类的子类对象。
        if(obj instanceof Student){
            // obj一定是学生类的对象了
            Student zzj1 = (Student) obj;
            // 自定义规则:两个对象的名称，年龄，性别，班级一样我们就认为是同一个对象
            if(this.name.equals(zzj1.name) && this.age == zzj1.age
                     && this.className.equals(zzj1.className) && this.sex == zzj1.sex){
                return true;
            }else{
                return false;
            }

        }else{
            // 学生与其他类型比较的结果肯定不相等！！
            return false ;
        }
    }*/

    // 自动生成equals
    // zzj.equals(zzj1) :
    // 比较者：    zzj    ==>  this
    // 被比较者：  zzj1   ==>  o
    @Override
    public boolean equals(Object o) {
        // 1.判断是否是同一个对象，如果是同一个对象比较直接返回true.
        if (this == o) return true;
        // 2.判断是不是同一个类型比较：学生必须与学生比较
        if (o == null || this.getClass() != o.getClass()) return false;
        // 3.说明o一定是学生类型了
        Student student = (Student) o;
        // 自定义规则进行比较
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name) &&
                Objects.equals(className, student.className);
    }


    public Student() {
    }

    public Student(String name, int age, char sex, String className) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
