package Day10Demo.com.itheima._06能够使用数组存储自定义类型并遍历;

public class ArrDemo01 {
    public static void main(String[] args){
        // 创建一个数组
        // 数据类型[] 变量 = new 数据类型[长度];
        // 数据类型[] 变量 = new 数据类型[]{元素1,元素2,...};
        String[] names = new String[3];
        // 赋值
        names[0] = "杨斌";
        names[1] = "周铭";
        names[2] = "徐明明";
        // 遍历
        for(int i = 0 ; i < names.length ; i++ ){
            String name = names[i];
            System.out.println(name);
        }

        System.out.println("----------------------------");
        // 使用数组存储自定义类型并遍历
        Student[] stus = new Student[3];
        // (int id, String name, int age, char sex, String className)
        stus[0] = new Student(1,"杨斌",21,'男',"99期");
        stus[1] = new Student(2,"周铭",22,'男',"99期");
        stus[2] = new Student(3,"徐明明",21,'男',"99期");

        // 遍历学生数组
        for(int i = 0 ; i < stus.length ; i++ ) {
            Student stu = stus[i];
            System.out.println(stu.getName()+"->"+stu.getClassName());
        }

    }
}
