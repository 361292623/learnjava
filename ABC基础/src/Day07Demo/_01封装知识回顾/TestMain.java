package Day07Demo._01封装知识回顾;
// 坚持！
public class TestMain {
    public static void main(String[] args){
        // 创建一个学生对象
        Student zc = new Student();
       /*
        zc.name = "周超";
        zc.age = 300;
        zc.sex = '人'; */
        zc.setAge(21);
        System.out.println(zc.getAge());


        zc.setSex('男');
        System.out.println(zc.getSex());

    }
}
