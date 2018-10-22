package 作业.关卡1训练2;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\a.txt");
        if(!f.exists()){
            System.out.println(f.createNewFile());
        }
    }


}
