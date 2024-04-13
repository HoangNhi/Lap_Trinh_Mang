package ltm_13042024.B10_TCP_Socket.Thread;

import javax.naming.Name;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Thread_ReadData extends Thread{
    private Socket socket;
    private String name;

    public Thread_ReadData(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try{
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            while(true){
                System.out.println(name + " : " + br.readLine());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
