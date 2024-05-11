package ltm_04052024.Bai12.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientRead extends Thread{
    private Socket socket;
    private InputStream input;
    public ClientRead(Socket socket){
        try{
            this.socket = socket;
            this.input = socket.getInputStream();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        try{
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead=input.read(buffer))!=-1){
                String message = new String(buffer, 0, byteRead);
                System.out.println(message);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
