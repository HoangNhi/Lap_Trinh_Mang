package ltm_30032024.test;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.util.Scanner;

public class MyNsLookup {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao domain name/ip de tra cuw thong tin");
            System.out.println("Nhap vao 'exit' de thoat");
            input = sc.nextLine();
            if(input.equals("Exit")){
                return;
            }

            try{
                InetAddress ia = InetAddress.getByName(input);

                System.out.println("\n\tIP: " + ia.getHostAddress());
                System.out.println("\tDomain: " + ia.getHostName());
                System.out.println("\tReachable: " + ia.isReachable(120));
                System.out.println("\tMulticastAddress: " + ia.isMulticastAddress());
                System.out.println("\tSiteLocalAddress: " + ia.isSiteLocalAddress()+ "\n");
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (true);
    }
}
