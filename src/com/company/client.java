package com.company;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 10007);
            OutputStream os = s.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            TestObject to = new TestObject(1, "object from client");
            oos.writeObject(to);
            oos.writeObject(new String("another object from the client"));
            oos.close();
            os.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}




