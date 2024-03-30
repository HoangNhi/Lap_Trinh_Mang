package ltm_30032024.test;

import java.net.URL;

public class ViduURL {
    public static void main(String[] args) {
        try{
            URL u = new URL("https://i.pinimg.com/236x/99/46/5b/99465b46614b062f85763fd8028fc254.jpg");
            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host: " + u.getHost());
            System.out.println("Port: " + u.getPort());
            System.out.println("File: " + u.getFile());
            System.out.println("Ref: " + u.getRef());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
