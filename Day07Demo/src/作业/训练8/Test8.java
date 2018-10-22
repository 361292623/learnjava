package 作业.训练8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test8 {
    public static void main(String[] args) {
        Student[] stu= new Student[4];
        stu[0] = new Student("贤总",99);
        stu[1] = new Student("易燃",98);
        stu[2] = new Student("灿亮",97);
        stu[3] = new Student("贤总2",96);

/*        Arrays.sort(stu, new Comparator <Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.getChengji()-o1.getChengji());
            }
        } );*/
        Arrays.sort(stu, ( o1,  o2) ->
                (int)(o2.getChengji()-o1.getChengji()));

        for (int i = 0 ; i<stu.length;i++){
            System.out.println(stu[i].getName()+"---"+stu[i].getChengji());
        }
    }
}
