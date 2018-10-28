package com.itheima.作业.训练6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端");
        ServerSocket ss = new ServerSocket(8899);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        while (true) {
            String line = null;
            if ((line = br.readLine()) != null) {
                System.out.println(line);

                OutputStream os = socket.getOutputStream();
                PrintStream ps = new PrintStream(os);
                ps.println("约");
            }


        }

    }
}
