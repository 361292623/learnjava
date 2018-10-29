package Day08Demo.com.itheima._05多态的概述;

public class Animal {

    private int id ;
    private String name ;
    private int age ;
    private char sex;


    public void sound(){
        System.out.println("动物可以发声！");
    }


    public Animal() {

    }

    public Animal(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
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
}
