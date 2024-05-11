package ltm_04052024.Bai12.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket mySocket;
    private ChatServer chatServer;
    private String Sid;
    private InputStream input;
    private OutputStream output;
    public ClientHandler(Socket mySocket, ChatServer chatServer, String id) {
        this.mySocket = mySocket;
        this.chatServer = chatServer;
        this.Sid = id;

        try{
            this.input = mySocket.getInputStream();
            this.output = mySocket.getOutputStream();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void run() {
        try{
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead=input.read(buffer)) != -1){
                String message = new String(buffer, 0, byteRead);
                chatServer.broadcastMessage(this.Sid, message);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void sendMessage(String ms){
        try{
            output.write(ms.getBytes());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String getSid() {
        return this.Sid;
    }
}
