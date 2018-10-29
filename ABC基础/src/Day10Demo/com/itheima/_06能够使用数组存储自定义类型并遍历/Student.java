package Day10Demo.com.itheima._06能够使用数组存储自定义类型并遍历;

public class Student {
    private int id ;
    private String name ;
    private int age ;
    private char sex ;
    private String className ;

    public Student() {
    }

    public Student(int id, String name, int age, char sex, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
