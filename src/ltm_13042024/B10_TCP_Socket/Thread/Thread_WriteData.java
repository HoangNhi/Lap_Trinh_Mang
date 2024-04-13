package ltm_13042024.B10_TCP_Socket.Thread;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Thread_WriteData extends Thread{
    private Socket socket;
    private String name;

    public Thread_WriteData(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try{
            OutputStream os = socket.getOutputStream();
            System.out.println("------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 'exit' to escape");
            System.out.println("Enter message content to send to Client/Server");
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
            while (true){
                String input = sc.nextLine();
                if(input.equals("exit")) break;
                pw.println(input);
                pw.flush();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
