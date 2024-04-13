package ltm_13042024.B10_TCP_Socket.Server;

import ltm_13042024.B10_TCP_Socket.Thread.Thread_ReadData;
import ltm_13042024.B10_TCP_Socket.Thread.Thread_WriteData;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serverchat {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(25000);
            System.out.println("Server đang chạy tại port: 25000");

            while (true) {
                Socket connection = server.accept();
                System.out.println("Chấp nhận kết nối từ client");

                Thread_ReadData tr = new Thread_ReadData(connection, "Client");
                Thread_WriteData tw = new Thread_WriteData(connection, "Client");
                tr.start();
                tw.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
