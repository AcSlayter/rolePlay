package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start server");
        while (true){

            new SocketManagment().build();

            if (stop_the_program()) break;
        }
        System.out.println("stopping Server");
    }

    private static boolean stop_the_program() {
        Scanner scanner = new Scanner(System.in);
        String kill = scanner.next();
        if(kill.contains("quit")) {
            return true;
        }
        return false;
    }

}
