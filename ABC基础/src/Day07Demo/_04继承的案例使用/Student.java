package Day07Demo._04继承的案例使用;

public class Student extends Human {
    // 成员变量
    private String className ; // 班级

    public void listen(){
        System.out.println("学生正在认真听课");
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
