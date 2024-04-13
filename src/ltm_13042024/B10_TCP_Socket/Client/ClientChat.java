package ltm_13042024.B10_TCP_Socket.Client;

import ltm_13042024.B10_TCP_Socket.Thread.Thread_ReadData;
import ltm_13042024.B10_TCP_Socket.Thread.Thread_WriteData;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        try{
            Socket client = new Socket("localhost", 25000);
            System.out.println("Connected to Server");

            Thread_ReadData tr = new Thread_ReadData(client, "Server");
            Thread_WriteData tw = new Thread_WriteData(client, "Server");
            tr.start();
            tw.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
