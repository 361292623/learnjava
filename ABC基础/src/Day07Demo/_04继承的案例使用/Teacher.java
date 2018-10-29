package Day07Demo._04继承的案例使用;

public class Teacher extends Human {
    // 工资
    private double salary ;

    public void teach(){
        System.out.println("老师正在上课");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
