package Day09Demo.com.itheima._08能够理解引用类型作为成员变量;

public class TestStuDemo01 {
    public static void main(String[] args){
        // Student(int id, String name, Clazz clazz)
        Clazz jjq = new Clazz(99,"Java基础班",85);
        Student stu = new Student(1,"石子涵",jjq);
        System.out.println(stu);

        Clazz j = stu.getClazz();
        System.out.println(j);
    }
}
