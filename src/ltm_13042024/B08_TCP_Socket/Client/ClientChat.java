package ltm_13042024.B08_TCP_Socket.Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        try{
            Socket client = new Socket("localhost", 25000);
            System.out.println("Connected to Server");

            InputStream is = client.getInputStream();
            OutputStream os = client.getOutputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));

            pw.println("Client: Xin chào, tôi là là Client");
            pw.flush();

            System.out.println("------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("'exit' to out");
            System.out.println("Enter message content to send to Server: ");
            while(true){
                System.out.println(br.readLine());
                String input = sc.nextLine();
                if(input.equals("exit")){
                    break;
                }

                pw.println("Client: " +input);
                pw.flush();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
