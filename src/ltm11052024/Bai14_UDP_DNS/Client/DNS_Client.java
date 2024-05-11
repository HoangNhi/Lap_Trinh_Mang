package ltm11052024.Bai14_UDP_DNS.Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DNS_Client {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            int serverPort = 9876;
            InetAddress serverAddress = InetAddress.getByName("localhost");

            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("Nhap vao ten mien can tra cuu: ");
                String domain = sc.nextLine();

                //Gui du lieu di
                byte[] sendData = domain.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);

                //Nhan phan hoi
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String ip = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println(ip);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
