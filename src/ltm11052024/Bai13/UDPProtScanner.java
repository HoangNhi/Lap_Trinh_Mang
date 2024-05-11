package ltm11052024.Bai13;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPProtScanner {
    public static void main(String[] args) {
        //Kiem tra tung Port
        for(int port = 1024; port<=65535; port++){
            try{
                // Kiem tra Port co duoc dung hay chua
                // Bang cach tao ra 1 datagram socket
                DatagramSocket Server = new DatagramSocket(port);
                // Tao thanh cong => Port truoc day chua duoc su dung
                Server.close();
            }catch (Exception ex){
                System.out.println("Port " + port + " dang duoc su dung");
            }
        }
    }
}
