package ltm18052024.Bai16_UDP_MULTICAST_LIGHTSTICK.main;

// Datagram: truyen cho tat ca
// Multicast: Join, truyen cho tat ca moi nguoi trong phong

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class LightControllerSender {
    private String ip;
    private int port;

    public LightControllerSender(String ip, int port) {
        this.ip = ip;
        this.port = port;

        sendMessage();
    }

    private void sendMessage(){
        try{
            InetAddress group = InetAddress.getByName(this.ip);
            MulticastSocket socket = new MulticastSocket();

            String[] colors = {"Red", "Green", "Blue"};
            int colorIndex = 0;

            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Ban muon chon mau nao: ");
                System.out.println("0. Red");
                System.out.println("1. Green");
                System.out.println("2. Blue");

                colorIndex = sc.nextInt();

                if(colorIndex > 2 || colorIndex < 0){
                    colorIndex = 0;
                }

                String message = colors[colorIndex];
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, group, this.port);
                socket.send(sendPacket);

                Thread.sleep(1000);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
