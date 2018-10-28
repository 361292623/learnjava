package com.itheima.作业.训练6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
      Socket socket = new Socket("127.0.0.1",8899);
      OutputStream os = socket.getOutputStream();
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));



//      bw.close();
 //       PrintStream ps = new PrintStream(os);
 //       ps.println("我是客户端，我给你发了：约吗？");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入：");
            String str = scanner.nextLine();
            if (str.equals("exit")){
                socket.shutdownOutput();
                break;
            }else {
                bw.write(str);
                bw.newLine();
                bw.flush();




                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = null ;
                if ((line=br.readLine())!=null){
                    System.out.println("服务端回复:"+line);
                }




            }

        }




    }
}
