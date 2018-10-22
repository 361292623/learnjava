package 作业.训练8;
//定义一个学生类，有两个属性。姓名，考试成绩
public class Student {
    private String name;
    private double chengji;

    public Student() {
    }

    public Student(String name, double chengji) {

        this.name = name;
        this.chengji = chengji;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChengji() {
        return chengji;
    }

    public void setChengji(double chengji) {
        this.chengji = chengji;
    }



}
