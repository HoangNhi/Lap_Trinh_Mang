package ltm11052024.Bai14_UDP_DNS.Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DNS_Server {
    public static void main(String[] args) {
        String[][] dnsTable= {
            {"www.example.com", "192.168.1.100"},
            {"www.google.com", "8.8.8.8"},
            {"cnpmqlknl20240505220615.azurewebsites.net", "13.75.34.160"}
        };

        try{
            DatagramSocket socket = new DatagramSocket(9876);

            // Lang nghe lien tuc
            while(true){
                // Tao va nhan goi tin tu client
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                // Truy van IP tu dns table
                String domainName = new String(receivePacket.getData(), 0, receivePacket.getLength());
                domainName = domainName.trim().toLowerCase();
                String result = "Error 404: Not Found";
                for(String[] entry: dnsTable){
                    if(entry[0].equals(domainName)){
                        result = entry[1];
                        break;
                    }
                }

                // Phan hoi thong tin
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                byte[] responseData = result.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
