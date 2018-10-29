package Day07Demo._04继承的案例使用;

public class TestMain {
    public static void main(String[] args){
        // 创建一个学生对象
        Student zc = new Student();
        zc.setName("周超");
        zc.setClassName("Java99期");
        zc.setWeight(120);

        System.out.println(zc.getName());
        System.out.println(zc.getClassName());
        System.out.println(zc.getWeight());

        zc.listen();
        zc.eat();

        // 创建一个老师对象
        Teacher dlei = new Teacher();
        dlei.setName("马云");
        dlei.setSalary(10000000.222);
        dlei.setSex('男');

        System.out.println(dlei.getName());
        System.out.println(dlei.getSalary());
        System.out.println(dlei.getSex());

        dlei.teach();
        dlei.eat();


    }
}
