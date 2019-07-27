package com.zlf.demo04;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10000);
        OutputStream out = s.getOutputStream();
        PrintStream ps = new PrintStream(out);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if ("886".equals(str)) break;
            ps.println(str);
        }
        out.close();
    }
}
