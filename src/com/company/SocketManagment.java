package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManagment {

    private ServerSocket serverSocket = null;
    private Socket clientSocket = null;

    public SocketManagment() {

    }

    public SocketManagment build() {
        invoke();
        return this;
    }

    private void invoke() {

        open_server_connection();
        wating_for_conection();

        try {
            InputStream inputStream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            TestObject objectNaas = (TestObject)objectInputStream.readObject();
            if (objectNaas != null){
                System.out.println(objectNaas.id);
                System.out.println(objectNaas.value);
            }
            objectInputStream.close();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        reply_to_request();


        close_client_socket();

        try {
            serverSocket.close();
        } catch (IOException e) {
            System.err.println("Could Not Close Socket");
            System.exit(1);
        }
    }

    private void close_client_socket() {
        try {
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("Could Not Close Socket");
            System.exit(1);
        }
    }

    private void open_server_connection() {
        try {
            int port = 10007;
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 10007.");
            System.exit(1);
        }
    }

    private void wating_for_conection() {
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
    }


}