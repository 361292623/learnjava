package Day09Demo.com.itheima._08能够理解引用类型作为成员变量;

public class Student {
    private int id ;
    private String name ;
    // 引用类型作为成员变量
    // 班级本身也是就一个引用类型
    // 修饰符 类型  变量名称
    private Clazz clazz ;

    public Student() {
    }

    public Student(int id, String name, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
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

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
