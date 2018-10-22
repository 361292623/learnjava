import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class test {
    static int a =1;
    static int b =10;
    public static void main(String[] args) throws IOException {



        FileOutputStream fo = new FileOutputStream("D:\\\\IdeaProjects\\\\learnjava\\\\learnjava\\\\src\\\\person.txt");
        fo.write("hello 黑马程序员".getBytes());
        fo.close();
        fo.write("hello 传智播客".getBytes());

    }
//      //  System.out.println(digui());;
//        System.out.println((int)'一');
//        System.out.println((int)'二');
//        System.out.println((int)'四');
//        System.out.println((int)'五');
//        System.out.println((int)'a');
//        System.out.println((int)'b');

    }


//    public static int digui (){
//
//
//
//        if(b==0){
//            return 1;
//        }else {
//            b--;
//        }
//
//        return a+digui();
//   }

