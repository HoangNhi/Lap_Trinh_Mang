package ltm18052024.Bai16_UDP_MULTICAST_LIGHTSTICK.test;

import ltm18052024.Bai16_UDP_MULTICAST_LIGHTSTICK.main.LightControllerSender;

public class SenderGroup1 {
    public static void main(String[] args) {
        new LightControllerSender("230.0.0.1", 6789);
    }
}
