package ltm_20042024.Bai11.server;

import java.net.ServerSocket;
import java.net.Socket;

public class RemoteServer {
    public static void main(String[] args) {
        try{

            ServerSocket ss = new ServerSocket(29999);
            System.out.println("Server is listening on Port: 29999");
            while(true){
                Socket s = ss.accept();
                System.out.println("A Client connected: " + s.getInetAddress().getHostAddress());
                handleRequest hr = new handleRequest(s);
                hr.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
