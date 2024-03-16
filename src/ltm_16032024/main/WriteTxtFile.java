package ltm_16032024.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Ghi de du lieu
public class WriteTxtFile {
    public static void main(String[] args) {
        try{
            String dest = "D:\\Desktop\\LAP_TRINH_MANG\\Workspace\\Workspace\\src\\ltm_16032024\\main\\hello.txt";
            File file = new File(dest);
            Scanner sc = new Scanner(System.in);
            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file, "UTF-8");


            System.out.println("Nhap du lieu: ");
            System.out.println("Nhap exit de thoat");
            while(true){
                String line = sc.nextLine();

                if(line.equals("exit")) break;
                pw.println(line); // Ghi de du lieu
                pw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
