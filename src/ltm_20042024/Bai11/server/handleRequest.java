package ltm_20042024.Bai11.server;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;

//
public class handleRequest extends Thread {
    private Socket socket;

    public handleRequest(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Robot robot = new Robot();
            //BufferedWriter bw = new BufferedWriter((new OutputStreamWriter()))

            while (true){
                // Read Request

                String request = br.readLine();
                System.out.println(request);

                if(request.equals("shutdown")){
                    Runtime.getRuntime().exec("shutdown -s -t 3600");
                }else if(request.equals("restart")){
                    Runtime.getRuntime().exec("shutdown -r -t 3600");
                }else if(request.equals("cancel")){
                    Runtime.getRuntime().exec("shutdown -a");
                }else if(request.equals("screenshot")){
                    BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(screenCapture, "png", baos);
                    byte[] imageBytes = baos.toByteArray();
                    baos.close();

                    writer.println(imageBytes.length);
                    writer.flush();
                    socket.getOutputStream().write(imageBytes);
                    socket.getOutputStream().flush();
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
