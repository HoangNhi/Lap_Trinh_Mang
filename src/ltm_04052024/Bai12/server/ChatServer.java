package ltm_04052024.Bai12.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    private static int PORT = 5000;
    private ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();

    public ChatServer(){
        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started. Listening on Port: " + PORT);

            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());

                ClientHandler clientHandler = new ClientHandler(clientSocket, this, System.currentTimeMillis() + "");
                clients.add(clientHandler);
                clientHandler.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void broadcastMessage(String id, String ms){
        for(ClientHandler client: clients){
            if(!client.getSid().equals(id)){
                client.sendMessage((id+" : " + ms));
            }
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
    }
}
