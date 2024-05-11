package ltm_04052024.Bai12.client;

import ltm_04052024.Bai12.server.ChatServer;

import java.net.Socket;

public class ChatClient {
    private static final String URL = "localhost";
    private static final int PORT = 5000;
    public ChatClient(){
        try{
            Socket socket = new Socket(this.URL, this.PORT);
            System.out.println("Connected to Server!");

            ClientRead clientRead = new ClientRead(socket);
            clientRead.start();

            ClientWrite clientWrite = new ClientWrite(socket);
            clientWrite.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
    }
}
