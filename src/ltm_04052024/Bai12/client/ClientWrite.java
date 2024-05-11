package ltm_04052024.Bai12.client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientWrite extends Thread {
    private Socket socket;
    private OutputStream output;
    public ClientWrite(Socket socket){
        try{
            this.socket = socket;
            this.output = this.socket.getOutputStream();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            while (true){
                String message = sc.nextLine();
                output.write(message.getBytes());
                output.flush();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
