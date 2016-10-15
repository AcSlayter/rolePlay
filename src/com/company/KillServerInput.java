package com.company;

import java.util.Scanner;

/**
 * Created by Aaron on 10/14/2016.
 */
public class KillServerInput implements Runnable{
    private boolean killServerBool = false;

    public synchronized boolean getKillServerBool() {
        return killServerBool;
    }

    public synchronized void setKillServerBool(boolean killServerBool) {
        this.killServerBool = killServerBool;
    }

    @Override
    public void run() {
        while(stop_the_program());
    }

    public void start () {
        System.out.println("Starting KillServerInput");
        Thread t = new Thread(this,"KillServerInput");
        t.start ();
    }


    private boolean stop_the_program() {
        Scanner scanner = new Scanner(System.in);
        String kill = scanner.next();
        if(kill.contains("quit")) {
            setKillServerBool(true);
        }else{
            setKillServerBool(false);
        }
        return true;
    }
}
