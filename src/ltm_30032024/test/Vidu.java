package ltm_30032024.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Vidu {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("Facebook.com");

        System.out.println(ia.getAddress()); // return Object
        System.out.println(ia.getHostAddress()); // return IP
        System.out.println(ia.getCanonicalHostName()); // return Full IP
        System.out.println(ia.getHostName()); // return Domain Name
    }
}
