package ltm_20042024.Bai11.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 29999);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter writer = new PrintWriter(s.getOutputStream());

            Scanner sc = new Scanner(System.in);
            boolean exit = false;

            while (!exit){
                System.out.println("----------");
                System.out.println("Choose Request");
                System.out.println("1. Shutdown");
                System.out.println("2. Reset");
                System.out.println("3. Cancel");
                System.out.println("4. Screenshot");
                System.out.println("5. Exit");
                System.out.print("Your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                System.out.println("Your choice is " + choice);
                switch (choice){
                    case 1:
                        writer.println("shutdown");
                        writer.flush();
                        break;
                    case 2:
                        writer.println("reset");
                        writer.flush();
                        break;
                    case 3:
                        writer.println("cancel");
                        writer.flush();
                        break;
                    case 4:
                        writer.println("screenshot");
                        writer.flush();

                        int imageSize = Integer.parseInt(reader.readLine());
                        byte[] imageBytes = new byte[imageSize];
                        int quantityOfByte = s.getInputStream().read(imageBytes);
                        if(quantityOfByte > 0){
                            System.out.print("Sign Name Of Image: ");
                            String fileName = sc.nextLine();
                            Path imgPath = Paths.get(fileName+".png");
                            Files.write(imgPath, imageBytes);
                            System.out.println("Done");
                        }
                        break;
                    case 5:
                        exit = true;
                    default:
                        throw new Exception("Your choice is not accept");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}