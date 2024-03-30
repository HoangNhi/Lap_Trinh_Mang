package ltm_30032024.test;

import java.net.InetAddress;

public class LocalHostInfo {
    public static void main(String[] args) {
        try{
            InetAddress ia = InetAddress.getLocalHost();

            System.out.println("\n\tIP: " + ia.getHostAddress());
            System.out.println("\tDomain: " + ia.getHostName());
            System.out.println("\tReachable: " + ia.isReachable(120));
            System.out.println("\tMulticastAddress: " + ia.isMulticastAddress());
            System.out.println("\tSiteLocalAddress: " + ia.isSiteLocalAddress()+ "\n");

            byte[] address = ia.getAddress();
            for (int i = 0; i<address.length; i++){
                System.out.println(address[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
