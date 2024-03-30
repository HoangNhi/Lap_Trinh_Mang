package ltm_30032024.test;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class InterfaceLister {
    public static void main(String[] args) {
        try{
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();

            while(interfaces.hasMoreElements()){
                NetworkInterface ni = (NetworkInterface) interfaces.nextElement();
                System.out.println("\t" + ni);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
