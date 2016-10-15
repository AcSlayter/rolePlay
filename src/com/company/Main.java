package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start server");
        KillServerInput killServerInput = new KillServerInput();
        killServerInput.start();

        while (true){

            new SocketManagment().build();

            if (killServerInput.getKillServerBool()) break;
        }
        System.out.println("stopping Server");
    }

}